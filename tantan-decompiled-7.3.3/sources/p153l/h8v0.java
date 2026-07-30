package p153l;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzfgq;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class h8v0 {

    /* JADX INFO: renamed from: a */
    public int f108275a = 0;

    /* JADX INFO: renamed from: b */
    public Map f108276b = new HashMap();

    /* JADX INFO: renamed from: c */
    public String f108277c = "";

    /* JADX INFO: renamed from: d */
    public long f108278d = -1;

    /* JADX INFO: renamed from: a */
    public static h8v0 m133991a(Reader reader) throws zzfgq {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                String strNextString = "";
                jsonReader.beginObject();
                long jNextLong = -1;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), v0t0.m198932d(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                h8v0 h8v0Var = new h8v0();
                h8v0Var.f108275a = iNextInt;
                if (strNextString != null) {
                    h8v0Var.f108277c = strNextString;
                }
                h8v0Var.f108278d = jNextLong;
                h8v0Var.f108276b = map;
                IOUtils.closeQuietly(reader);
                return h8v0Var;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException e) {
            e = e;
            throw new zzfgq("Unable to parse Response", e);
        } catch (AssertionError e2) {
            e = e2;
            throw new zzfgq("Unable to parse Response", e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new zzfgq("Unable to parse Response", e);
        } catch (NumberFormatException e4) {
            e = e4;
            throw new zzfgq("Unable to parse Response", e);
        }
    }
}
