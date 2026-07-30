package p149l;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.heytap.mcssdk.mode.CommandMessage;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dou0 {

    /* JADX INFO: renamed from: a */
    public final Clock f87201a;

    public dou0(Clock clock) {
        this.f87201a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m112826a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) eas0.f90242a.m115379e()).booleanValue()) {
            long jCurrentTimeMillis = this.f87201a.currentTimeMillis();
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
                x2t0.m206867e("unable to log", e);
            }
            x2t0.m206868f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
