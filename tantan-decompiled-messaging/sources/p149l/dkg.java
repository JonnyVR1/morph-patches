package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes10.dex */
public class dkg {

    /* JADX INFO: renamed from: l.dkg$a */
    public class C16401a implements OnCompleteListener<String> {
        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            if (task.mo15377p()) {
                e51.m114766q(task.mo15373l());
                lsi0.m151595y("复制安装ID成功");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m112221a() {
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(new C16401a());
    }

    /* JADX INFO: renamed from: b */
    public static String m112222b() {
        return ckg.m107410m().m111183d().m221515e();
    }
}
