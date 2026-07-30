package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ComplimentFromOther;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class dr5 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f87572f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f87573g;

    /* JADX INFO: renamed from: h */
    public VImage f87574h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f87575i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f87576j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f87577k;

    /* JADX INFO: renamed from: l */
    public View f87578l;

    /* JADX INFO: renamed from: m */
    public AutoVDraweeView f87579m;

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m113278E(Throwable th) {
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        if (user == null) {
            return;
        }
        io5 io5VarM137292h = io5.m137292h();
        ComplimentFromOther complimentFromOtherM137294g = io5VarM137292h.m137294g(user.f56011id);
        if (io5VarM137292h.m137295i(user.f56011id)) {
            m113283J(complimentFromOtherM137294g, user);
        } else {
            xdl0.m208344M(m209783m(), false);
            m209781k(m167252w(), io5VarM137292h.m137293f(user.f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.yq5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199524a.m113283J(user, (ComplimentFromOther) obj);
                }
            }, new e30() { // from class: l.zq5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204343a.m113284K((Throwable) obj);
                }
            }));
        }
        if (co5.m107930b(m167252w())) {
            co5.m107938j();
        } else {
            m209781k(m167252w(), ExpandedCardStyleHelper.m38090o().m38109y().filter(new w9j() { // from class: l.ar5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ExpandedCardStyleHelper.C7951b) obj).m38115e());
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.br5
                @Override // p149l.e30
                public final void call(Object obj) {
                    co5.m107938j();
                }
            }, new e30() { // from class: l.cr5
                @Override // p149l.e30
                public final void call(Object obj) {
                    dr5.m113278E((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m113282I(View view) {
        er5.m117822a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m113284K(Throwable th) {
        xdl0.m208344M(m209783m(), true);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m113283J(ComplimentFromOther complimentFromOther, User user) {
        String str;
        if (complimentFromOther == null) {
            xdl0.m208344M(m209783m(), false);
            return;
        }
        xdl0.m208344M(m209783m(), true);
        VText_NoTopPadding vText_NoTopPadding = this.f87575i;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(m167252w().getString(R$string.f17906L9));
        }
        VText_NoTopPadding vText_NoTopPadding2 = this.f87577k;
        if (vText_NoTopPadding2 != null && (str = complimentFromOther.value) != null) {
            vText_NoTopPadding2.setText(str);
        }
        if (this.f87579m != null) {
            Media media = complimentFromOther.media;
            String strM190084a = media != null ? tq5.m190084a(media) : null;
            if (!TextUtils.isEmpty(strM190084a)) {
                qib0.f154691G.m102325I0(this.f87579m, strM190084a, t100.m186890d(64.0f), t100.m186890d(64.0f));
                xdl0.m208344M(this.f87579m, true);
                return;
            }
            List<Media> list = user.pictures;
            if (list == null || list.isEmpty()) {
                xdl0.m208344M(this.f87579m, false);
            } else {
                qib0.f154691G.m102341Q0(this.f87579m, user.m60124fp().profileSize(64));
                xdl0.m208344M(this.f87579m, true);
            }
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m113282I(view);
    }
}
