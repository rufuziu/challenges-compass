package Calculator;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Memory implements Map<String, Float> {
  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }

  @Override
  public Float get(Object key) {
    return null;
  }

  @Override
  public Float put(String key, Float value) {
    return null;
  }

  @Override
  public Float remove(Object key) {
    return null;
  }

  @Override
  public void putAll(Map<? extends String, ? extends Float> m) {

  }

  @Override
  public void clear() {

  }

  @Override
  public Set<String> keySet() {
    return null;
  }

  @Override
  public Collection<Float> values() {
    return null;
  }

  @Override
  public Set<Entry<String, Float>> entrySet() {
    return null;
  }
}
