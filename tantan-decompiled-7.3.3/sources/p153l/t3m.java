package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public interface t3m extends s7m, nol<Act> {
    /* JADX INFO: renamed from: C2 */
    CategorySuggestions mo52233C2();

    /* JADX INFO: renamed from: D2 */
    boolean mo52236D2();

    /* JADX INFO: renamed from: E */
    void mo52239E();

    /* JADX INFO: renamed from: E1 */
    boolean mo53254E1();

    /* JADX INFO: renamed from: E2 */
    pf60<Integer, Integer> mo53255E2();

    /* JADX INFO: renamed from: F1 */
    User mo52241F1(boolean z);

    /* JADX INFO: renamed from: G */
    void mo52243G(View... viewArr);

    /* JADX INFO: renamed from: G0 */
    boolean mo53266G0(User user);

    /* JADX INFO: renamed from: H2 */
    LayoutInflater mo146493H2();

    /* JADX INFO: renamed from: H3 */
    pf60<List<Literatures>, List<LiteraturesComments>> mo52245H3();

    /* JADX INFO: renamed from: I1 */
    boolean mo53279I1();

    /* JADX INFO: renamed from: J1 */
    PutongFrag mo52249J1();

    /* JADX INFO: renamed from: J3 */
    void mo52250J3();

    /* JADX INFO: renamed from: K3 */
    int mo53293K3();

    /* JADX INFO: renamed from: M */
    boolean mo53305M();

    /* JADX INFO: renamed from: M0 */
    View mo53306M0();

    /* JADX INFO: renamed from: N2 */
    boolean mo53313N2();

    /* JADX INFO: renamed from: O1 */
    boolean mo53319O1();

    /* JADX INFO: renamed from: P */
    boolean mo53326P(String str);

    /* JADX INFO: renamed from: P1 */
    boolean mo52258P1();

    /* JADX INFO: renamed from: Q */
    boolean mo53333Q();

    /* JADX INFO: renamed from: R */
    boolean mo52261R();

    /* JADX INFO: renamed from: R0 */
    boolean mo52262R0();

    /* JADX INFO: renamed from: R1 */
    void mo53341R1(int i);

    /* JADX INFO: renamed from: R3 */
    void mo52263R3();

    /* JADX INFO: renamed from: S */
    boolean mo52265S();

    /* JADX INFO: renamed from: V2 */
    RelationshipStatus mo53371V2();

    /* JADX INFO: renamed from: W */
    RecyclerView mo53378W();

    /* JADX INFO: renamed from: X1 */
    boolean mo53385X1();

    /* JADX INFO: renamed from: Y0 */
    ViewGroup mo52272Y0();

    /* JADX INFO: renamed from: Z */
    void mo53398Z(int i);

    /* JADX INFO: renamed from: Z1 */
    boolean mo53399Z1();

    /* JADX INFO: renamed from: Z2 */
    int mo52275Z2();

    /* JADX INFO: renamed from: a0 */
    boolean mo53405a0();

    /* JADX INFO: renamed from: c3 */
    boolean mo53416c3(User user);

    /* JADX INFO: renamed from: d1 */
    int mo53422d1();

    String from();

    /* JADX INFO: renamed from: g3 */
    boolean mo52289g3();

    Context getContext();

    /* JADX INFO: renamed from: h3 */
    void mo52291h3();

    /* JADX INFO: renamed from: i2 */
    default User m189086i2() {
        return mo52241F1(true);
    }

    /* JADX INFO: renamed from: i3 */
    int mo52294i3();

    /* JADX INFO: renamed from: j3 */
    void mo52296j3(int i);

    /* JADX INFO: renamed from: k0 */
    void mo146496k0(Intent intent, C4468a.a aVar);

    C22421c<C4470c> lifecycle();

    C4470c lifecycle_();

    /* JADX INFO: renamed from: m0 */
    boolean mo52302m0();

    /* JADX INFO: renamed from: m2 */
    void mo53471m2(int i, boolean z);

    /* JADX INFO: renamed from: m3 */
    boolean mo53472m3(User user);

    /* JADX INFO: renamed from: me */
    User mo53478me();

    /* JADX INFO: renamed from: o */
    void mo52306o();

    /* JADX INFO: renamed from: o1 */
    boolean mo53484o1();

    /* JADX INFO: renamed from: p2 */
    boolean mo53493p2();

    /* JADX INFO: renamed from: p3 */
    void mo52308p3(int i, Media media);

    String pageId();

    /* JADX INFO: renamed from: q */
    ViewGroup mo52310q();

    /* JADX INFO: renamed from: q3 */
    boolean mo53499q3();

    /* JADX INFO: renamed from: s */
    default boolean m189087s() {
        return true;
    }

    /* JADX INFO: renamed from: s1 */
    boolean mo53510s1();

    /* JADX INFO: renamed from: s2 */
    LikedUser mo53511s2();

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    /* JADX INFO: renamed from: t1 */
    void mo53517t1();

    /* JADX INFO: renamed from: v1 */
    boolean mo53530v1();

    /* JADX INFO: renamed from: v2 */
    boolean mo53531v2();

    /* JADX INFO: renamed from: y0 */
    String mo53547y0();

    /* JADX INFO: renamed from: y2 */
    boolean mo53549y2();
}
