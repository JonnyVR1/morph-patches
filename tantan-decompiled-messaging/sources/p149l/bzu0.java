package p149l;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzfgq;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bzu0 {

    /* JADX INFO: renamed from: a */
    public int f78062a = 0;

    /* JADX INFO: renamed from: b */
    public Map f78063b = new HashMap();

    /* JADX INFO: renamed from: c */
    public String f78064c = "";

    /* JADX INFO: renamed from: d */
    public long f78065d = -1;

    /* JADX INFO: renamed from: a */
    public static bzu0 m104645a(Reader reader) throws zzfgq {
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
                            map.put(jsonReader.nextName(), prs0.m171063d(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                bzu0 bzu0Var = new bzu0();
                bzu0Var.f78062a = iNextInt;
                if (strNextString != null) {
                    bzu0Var.f78064c = strNextString;
                }
                bzu0Var.f78065d = jNextLong;
                bzu0Var.f78063b = map;
                IOUtils.closeQuietly(reader);
                return bzu0Var;
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
