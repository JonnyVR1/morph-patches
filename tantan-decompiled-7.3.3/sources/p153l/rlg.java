package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes12.dex */
public class rlg {

    /* JADX INFO: renamed from: l.rlg$a */
    public class C19870a implements OnCompleteListener<String> {
        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            if (task.mo15431p()) {
                l51.m152911q(task.mo15427l());
                o1j0.m165651y("复制安装ID成功");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m181990a() {
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(new C19870a());
    }

    /* JADX INFO: renamed from: b */
    public static String m181991b() {
        return qlg.m177000m().m135828d().m222761e();
    }
}
