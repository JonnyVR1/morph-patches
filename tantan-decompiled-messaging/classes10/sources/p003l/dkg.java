package p003l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;
import l.ckg;
import l.e51;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dkg {

    /* JADX INFO: renamed from: l.dkg$a */
    public class C3323a implements OnCompleteListener<String> {
        public void onComplete(@NonNull Task<String> task) {
            if (task.p()) {
                e51.q((String) task.l());
                lsi0.y("复制安装ID成功");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6170a() {
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(new C3323a());
    }

    /* JADX INFO: renamed from: b */
    public static String m6171b() {
        return (String) ckg.m().d().e();
    }
}
