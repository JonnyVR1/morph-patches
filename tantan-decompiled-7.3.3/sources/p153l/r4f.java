package p153l;

import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.data.User;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface r4f {
    /* JADX INFO: renamed from: a */
    String mo132264a();

    /* JADX INFO: renamed from: b */
    HashMap<String, String> mo132265b(MonitorEvent monitorEvent);

    /* JADX INFO: renamed from: c */
    String mo132266c();

    /* JADX INFO: renamed from: d */
    String mo132267d();

    /* JADX INFO: renamed from: e */
    String mo132268e();

    /* JADX INFO: renamed from: f */
    HashMap<String, String> mo132269f(MonitorEvent monitorEvent);

    /* JADX INFO: renamed from: g */
    List<String> mo132270g();

    String getChannel();

    User getUserInfo();
}
