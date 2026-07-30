package p002l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import java.util.Collection;
import java.util.List;
import l.r8d0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface w2m {
    /* JADX INFO: renamed from: a */
    void mo9803a();

    /* JADX INFO: renamed from: b */
    void mo9804b(Collection<String> collection);

    /* JADX INFO: renamed from: c */
    void mo9805c(int i);

    /* JADX INFO: renamed from: d */
    void mo9806d(JumpRoomData jumpRoomData);

    /* JADX INFO: renamed from: e */
    void mo9807e(r8d0 r8d0Var);

    @NonNull
    /* JADX INFO: renamed from: f */
    hqv mo9808f();

    /* JADX INFO: renamed from: g */
    c<hqv> mo9809g();

    /* JADX INFO: renamed from: h */
    default List<String> m24294h() {
        return mo9808f().m14718k();
    }

    /* JADX INFO: renamed from: i */
    void mo9810i(r8d0 r8d0Var, boolean z);
}
