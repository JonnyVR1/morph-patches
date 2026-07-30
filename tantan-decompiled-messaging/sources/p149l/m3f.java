package p149l;

import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.data.User;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface m3f {
    /* JADX INFO: renamed from: a */
    String mo152849a();

    /* JADX INFO: renamed from: b */
    HashMap<String, String> mo152850b(MonitorEvent monitorEvent);

    /* JADX INFO: renamed from: c */
    String mo152851c();

    /* JADX INFO: renamed from: d */
    String mo152852d();

    /* JADX INFO: renamed from: e */
    String mo152853e();

    /* JADX INFO: renamed from: f */
    HashMap<String, String> mo152854f(MonitorEvent monitorEvent);

    /* JADX INFO: renamed from: g */
    List<String> mo152855g();

    String getChannel();

    User getUserInfo();
}
