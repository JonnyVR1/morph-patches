package p009l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.ComplimentFromOther;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.co5;
import l.e30;
import l.er5;
import l.mkd0;
import l.qib0;
import l.t100;
import l.tq5;
import l.w9j;
import l.xdl0;
import v.AutoVDraweeView;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dr5 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f11960f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f11961g;

    /* JADX INFO: renamed from: h */
    public VImage f11962h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f11963i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f11964j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f11965k;

    /* JADX INFO: renamed from: l */
    public View f11966l;

    /* JADX INFO: renamed from: m */
    public AutoVDraweeView f11967m;

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m13460E(Throwable th) {
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        if (user == null) {
            return;
        }
        io5 io5VarM16650h = io5.m16650h();
        ComplimentFromOther complimentFromOtherM16652g = io5VarM16650h.m16652g(((DbObject) user).id);
        if (io5VarM16650h.m16653i(((DbObject) user).id)) {
            m13465J(complimentFromOtherM16652g, user);
        } else {
            xdl0.M(m24921m(), false);
            m24919k(m20098w(), io5VarM16650h.m16651f(((DbObject) user).id)).subscribe(mkd0.H(new e30() { // from class: l.yq5
                public final void call(Object obj) {
                    this.f23207a.m13465J(user, (ComplimentFromOther) obj);
                }
            }, new e30() { // from class: l.zq5
                public final void call(Object obj) {
                    this.f23831a.m13466K((Throwable) obj);
                }
            }));
        }
        if (co5.b(m20098w())) {
            co5.j();
        } else {
            m24919k(m20098w(), ExpandedCardStyleHelper.m2064o().m2083y().filter(new w9j() { // from class: l.ar5
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ExpandedCardStyleHelper.C0115b) obj).m2089e());
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.br5
                public final void call(Object obj) {
                    co5.j();
                }
            }, new e30() { // from class: l.cr5
                public final void call(Object obj) {
                    dr5.m13460E((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m13464I(View view) {
        er5.a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m13466K(Throwable th) {
        xdl0.M(m24921m(), true);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m13465J(ComplimentFromOther complimentFromOther, User user) {
        String str;
        if (complimentFromOther == null) {
            xdl0.M(m24921m(), false);
            return;
        }
        xdl0.M(m24921m(), true);
        VText_NoTopPadding vText_NoTopPadding = this.f11963i;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(m20098w().getString(R.string.L9));
        }
        VText_NoTopPadding vText_NoTopPadding2 = this.f11965k;
        if (vText_NoTopPadding2 != null && (str = complimentFromOther.value) != null) {
            vText_NoTopPadding2.setText(str);
        }
        if (this.f11967m != null) {
            Media media = complimentFromOther.media;
            String strA = media != null ? tq5.a(media) : null;
            if (!TextUtils.isEmpty(strA)) {
                qib0.G.I0(this.f11967m, strA, t100.d(64.0f), t100.d(64.0f));
                xdl0.M(this.f11967m, true);
                return;
            }
            List list = user.pictures;
            if (list == null || list.isEmpty()) {
                xdl0.M(this.f11967m, false);
            } else {
                qib0.G.Q0(this.f11967m, user.fp().profileSize(64));
                xdl0.M(this.f11967m, true);
            }
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m13464I(view);
    }
}
