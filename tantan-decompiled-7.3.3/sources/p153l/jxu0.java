package p153l;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.heytap.mcssdk.mode.CommandMessage;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jxu0 {

    /* JADX INFO: renamed from: a */
    public final Clock f123084a;

    public jxu0(Clock clock) {
        this.f123084a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m147427a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) kjs0.f127139a.m149974e()).booleanValue()) {
            long jCurrentTimeMillis = this.f123084a.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(CommandMessage.PARAMS).beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                dct0.m115296e("unable to log", e);
            }
            dct0.m115297f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
