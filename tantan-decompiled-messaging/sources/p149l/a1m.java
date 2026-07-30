package p149l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public interface a1m extends c5m, bml<Act> {
    /* JADX INFO: renamed from: C2 */
    CategorySuggestions mo51050C2();

    /* JADX INFO: renamed from: D2 */
    boolean mo51053D2();

    /* JADX INFO: renamed from: E */
    void mo51056E();

    /* JADX INFO: renamed from: E1 */
    boolean mo52071E1();

    /* JADX INFO: renamed from: E2 */
    j760<Integer, Integer> mo52072E2();

    /* JADX INFO: renamed from: F1 */
    User mo51058F1(boolean z);

    /* JADX INFO: renamed from: G */
    void mo51060G(View... viewArr);

    /* JADX INFO: renamed from: G0 */
    boolean mo52083G0(User user);

    /* JADX INFO: renamed from: H2 */
    LayoutInflater mo94568H2();

    /* JADX INFO: renamed from: H3 */
    j760<List<Literatures>, List<LiteraturesComments>> mo51062H3();

    /* JADX INFO: renamed from: I1 */
    boolean mo52096I1();

    /* JADX INFO: renamed from: J1 */
    PutongFrag mo51066J1();

    /* JADX INFO: renamed from: J3 */
    void mo51067J3();

    /* JADX INFO: renamed from: K3 */
    int mo52110K3();

    /* JADX INFO: renamed from: M */
    boolean mo52122M();

    /* JADX INFO: renamed from: M0 */
    View mo52123M0();

    /* JADX INFO: renamed from: N2 */
    boolean mo52130N2();

    /* JADX INFO: renamed from: O1 */
    boolean mo52136O1();

    /* JADX INFO: renamed from: P */
    boolean mo52143P(String str);

    /* JADX INFO: renamed from: P1 */
    boolean mo51075P1();

    /* JADX INFO: renamed from: Q */
    boolean mo52150Q();

    /* JADX INFO: renamed from: R */
    boolean mo51078R();

    /* JADX INFO: renamed from: R0 */
    boolean mo51079R0();

    /* JADX INFO: renamed from: R1 */
    void mo52158R1(int i);

    /* JADX INFO: renamed from: R3 */
    void mo51080R3();

    /* JADX INFO: renamed from: S */
    boolean mo51082S();

    /* JADX INFO: renamed from: V2 */
    RelationshipStatus mo52188V2();

    /* JADX INFO: renamed from: W */
    RecyclerView mo52195W();

    /* JADX INFO: renamed from: X1 */
    boolean mo52202X1();

    /* JADX INFO: renamed from: Y0 */
    ViewGroup mo51089Y0();

    /* JADX INFO: renamed from: Z */
    void mo52215Z(int i);

    /* JADX INFO: renamed from: Z1 */
    boolean mo52216Z1();

    /* JADX INFO: renamed from: Z2 */
    int mo51092Z2();

    /* JADX INFO: renamed from: a0 */
    boolean mo52222a0();

    /* JADX INFO: renamed from: c3 */
    boolean mo52233c3(User user);

    /* JADX INFO: renamed from: d1 */
    int mo52239d1();

    String from();

    /* JADX INFO: renamed from: g3 */
    boolean mo51106g3();

    Context getContext();

    /* JADX INFO: renamed from: h3 */
    void mo51108h3();

    /* JADX INFO: renamed from: i2 */
    default User m94569i2() {
        return mo51058F1(true);
    }

    /* JADX INFO: renamed from: i3 */
    int mo51111i3();

    /* JADX INFO: renamed from: j3 */
    void mo51113j3(int i);

    /* JADX INFO: renamed from: k0 */
    void mo94570k0(Intent intent, C4317a.a aVar);

    C22306c<C4319c> lifecycle();

    C4319c lifecycle_();

    /* JADX INFO: renamed from: m0 */
    boolean mo51119m0();

    /* JADX INFO: renamed from: m2 */
    void mo52288m2(int i, boolean z);

    /* JADX INFO: renamed from: m3 */
    boolean mo52289m3(User user);

    /* JADX INFO: renamed from: me */
    User mo52295me();

    /* JADX INFO: renamed from: o */
    void mo51123o();

    /* JADX INFO: renamed from: o1 */
    boolean mo52301o1();

    /* JADX INFO: renamed from: p */
    ViewGroup mo51125p();

    /* JADX INFO: renamed from: p2 */
    boolean mo52310p2();

    /* JADX INFO: renamed from: p3 */
    void mo51126p3(int i, Media media);

    String pageId();

    /* JADX INFO: renamed from: q3 */
    boolean mo52316q3();

    /* JADX INFO: renamed from: s */
    default boolean m94571s() {
        return true;
    }

    /* JADX INFO: renamed from: s1 */
    boolean mo52327s1();

    /* JADX INFO: renamed from: s2 */
    LikedUser mo52328s2();

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    /* JADX INFO: renamed from: t1 */
    void mo52334t1();

    /* JADX INFO: renamed from: v1 */
    boolean mo52347v1();

    /* JADX INFO: renamed from: v2 */
    boolean mo52348v2();

    /* JADX INFO: renamed from: y0 */
    String mo52364y0();

    /* JADX INFO: renamed from: y2 */
    boolean mo52366y2();
}
