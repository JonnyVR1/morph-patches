package p002l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.j760;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface a1m extends c5m, bml<Act> {
    /* JADX INFO: renamed from: C2 */
    CategorySuggestions mo1498C2();

    /* JADX INFO: renamed from: D2 */
    boolean mo1501D2();

    /* JADX INFO: renamed from: E */
    void mo1504E();

    /* JADX INFO: renamed from: E1 */
    boolean mo2600E1();

    /* JADX INFO: renamed from: E2 */
    j760<Integer, Integer> mo2601E2();

    /* JADX INFO: renamed from: F1 */
    User mo1506F1(boolean z);

    /* JADX INFO: renamed from: G */
    void mo1508G(View... viewArr);

    /* JADX INFO: renamed from: G0 */
    boolean mo2612G0(User user);

    /* JADX INFO: renamed from: H2 */
    LayoutInflater mo9267H2();

    /* JADX INFO: renamed from: H3 */
    j760<List<Literatures>, List<LiteraturesComments>> mo1510H3();

    /* JADX INFO: renamed from: I1 */
    boolean mo2625I1();

    /* JADX INFO: renamed from: J1 */
    PutongFrag mo1514J1();

    /* JADX INFO: renamed from: J3 */
    void mo1515J3();

    /* JADX INFO: renamed from: K3 */
    int mo2639K3();

    /* JADX INFO: renamed from: M */
    boolean mo2651M();

    /* JADX INFO: renamed from: M0 */
    View mo2652M0();

    /* JADX INFO: renamed from: N2 */
    boolean mo2659N2();

    /* JADX INFO: renamed from: O1 */
    boolean mo2665O1();

    /* JADX INFO: renamed from: P */
    boolean mo2672P(String str);

    /* JADX INFO: renamed from: P1 */
    boolean mo1523P1();

    /* JADX INFO: renamed from: Q */
    boolean mo2679Q();

    /* JADX INFO: renamed from: R */
    boolean mo1526R();

    /* JADX INFO: renamed from: R0 */
    boolean mo1527R0();

    /* JADX INFO: renamed from: R1 */
    void mo2687R1(int i);

    /* JADX INFO: renamed from: R3 */
    void mo1528R3();

    /* JADX INFO: renamed from: S */
    boolean mo1530S();

    /* JADX INFO: renamed from: V2 */
    RelationshipStatus mo2717V2();

    /* JADX INFO: renamed from: W */
    RecyclerView mo2724W();

    /* JADX INFO: renamed from: X1 */
    boolean mo2731X1();

    /* JADX INFO: renamed from: Y0 */
    ViewGroup mo1537Y0();

    /* JADX INFO: renamed from: Z */
    void mo2744Z(int i);

    /* JADX INFO: renamed from: Z1 */
    boolean mo2745Z1();

    /* JADX INFO: renamed from: Z2 */
    int mo1540Z2();

    /* JADX INFO: renamed from: a0 */
    boolean mo2751a0();

    /* JADX INFO: renamed from: c3 */
    boolean mo2762c3(User user);

    /* JADX INFO: renamed from: d1 */
    int mo2768d1();

    String from();

    /* JADX INFO: renamed from: g3 */
    boolean mo1556g3();

    Context getContext();

    /* JADX INFO: renamed from: h3 */
    void mo1559h3();

    /* JADX INFO: renamed from: i2 */
    default User m9268i2() {
        return mo1506F1(true);
    }

    /* JADX INFO: renamed from: i3 */
    int mo1562i3();

    /* JADX INFO: renamed from: j3 */
    void mo1564j3(int i);

    /* JADX INFO: renamed from: k0 */
    void mo9269k0(Intent intent, a.a aVar);

    c<com.p1.mobile.android.app.c> lifecycle();

    com.p1.mobile.android.app.c lifecycle_();

    /* JADX INFO: renamed from: m0 */
    boolean mo1570m0();

    /* JADX INFO: renamed from: m2 */
    void mo2820m2(int i, boolean z);

    /* JADX INFO: renamed from: m3 */
    boolean mo2821m3(User user);

    /* JADX INFO: renamed from: me */
    User mo2827me();

    /* JADX INFO: renamed from: o */
    void mo1575o();

    /* JADX INFO: renamed from: o1 */
    boolean mo2834o1();

    /* JADX INFO: renamed from: p */
    ViewGroup mo1577p();

    /* JADX INFO: renamed from: p2 */
    boolean mo2843p2();

    /* JADX INFO: renamed from: p3 */
    void mo1578p3(int i, Media media);

    String pageId();

    /* JADX INFO: renamed from: q3 */
    boolean mo2849q3();

    /* JADX INFO: renamed from: s */
    default boolean m9270s() {
        return true;
    }

    /* JADX INFO: renamed from: s1 */
    boolean mo2860s1();

    /* JADX INFO: renamed from: s2 */
    LikedUser mo2861s2();

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    /* JADX INFO: renamed from: t1 */
    void mo2867t1();

    /* JADX INFO: renamed from: v1 */
    boolean mo2880v1();

    /* JADX INFO: renamed from: v2 */
    boolean mo2881v2();

    /* JADX INFO: renamed from: y0 */
    String mo2897y0();

    /* JADX INFO: renamed from: y2 */
    boolean mo2899y2();
}
