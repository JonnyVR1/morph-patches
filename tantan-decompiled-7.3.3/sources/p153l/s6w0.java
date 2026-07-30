package p153l;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class s6w0 {

    /* JADX INFO: renamed from: a */
    public String f166618a;

    public s6w0(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    jsonReader.nextInt();
                } else {
                    jsonReader.skipValue();
                }
            } else if (strNextName.equals("description")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f166618a = strNextString;
    }

    /* JADX INFO: renamed from: a */
    public final String m184927a() {
        return this.f166618a;
    }
}
