package karton.delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PropMap<V>(private val inMap: MutableMap<String, V> = mutableMapOf()) : IPropMap {

    override fun resetProps() {
        inMap.clear()
    }

    operator fun <SV : V> invoke(default: SV? = null) = Ref(default)

    @Suppress("UNCHECKED_CAST")
    inner class  Ref<SV : V>(private val default: SV? = null) : ReadWriteProperty<Any?, SV> {

        override fun getValue(thisRef: Any?, property: KProperty<*>): SV {
            return this@PropMap.inMap.getOrElse(property.name, { default }) as SV
        }

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: SV) {
            this@PropMap.inMap.setValue(thisRef, property, value)
        }

    }

}

