package p153l;

import android.os.Bundle;
import android.util.JsonReader;
import com.heytap.mcssdk.mode.CommandMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rqr0 {

    /* JADX INFO: renamed from: a */
    public final String f164514a;

    /* JADX INFO: renamed from: b */
    public String f164515b;

    /* JADX INFO: renamed from: c */
    public Bundle f164516c = new Bundle();

    public rqr0(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -995427962) {
                if (iHashCode == -271442291 && strNextName.equals("signal_dictionary")) {
                    map = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        map.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                }
            } else if (strNextName.equals(CommandMessage.PARAMS)) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        this.f164514a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f164516c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
