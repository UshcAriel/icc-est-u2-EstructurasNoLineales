package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import models.Contacto;

public class Maps {

    public Map<String, Integer> contruirHashMap(){
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A",10);
        mapa.put("D",60);
        mapa.put("A",10);
        mapa.put("C",20);
        mapa.put("B",30);
        mapa.put("A",50);

        System.err.println(mapa.size());

        for(int i = 0; i < mapa.size(); i++){
            System.err.println(mapa.values().toArray()[i]);
        }

        for (String key : mapa.keySet()) {
            System.err.println(key);
            
        }

        System.err.println(mapa.get("A"));
        System.err.println(mapa.get("B"));
        System.err.println(mapa.get("F"));

        mapa.putIfAbsent("A", 100);
        mapa.putIfAbsent("F", 200);

        System.err.println(mapa);
        
        return mapa;
    }

    public Map<String, Integer> cLinkedHashMap(){
        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("A",10);
        mapa.put("D",60);
        mapa.put("A",10);
        mapa.put("C",20);
        mapa.put("B",30);
        mapa.put("A",50);

        return mapa;
    }

    public Map<String, Integer> cTreeMap(){
        Map<String, Integer> mapa = new TreeMap<>();
        mapa.put("a",10);
        mapa.put("AB",60);
        mapa.put("A",10);
        mapa.put("aA",20);
        mapa.put("Ab",30);
        mapa.put("ab",50);

        System.err.println(mapa);

        return mapa;
    }

    public Set<Contacto> filtrarOrdenarUnicos(List<Contacto> contactos) {

        Set<Contacto> nueva = new TreeSet<>(
            (c1, c2) -> {
                if (c1.getNombre().equals(c2.getNombre())) {
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
            });

        for (Contacto contacto : contactos) {
            nueva.add(contacto);
        }
        return nueva;
    }
           
}
