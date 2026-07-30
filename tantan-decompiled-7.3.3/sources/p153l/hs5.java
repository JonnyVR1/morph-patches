package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ComplimentFromOther;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class hs5 extends f6l {

    /* JADX INFO: renamed from: f */
    public VLinear f111411f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f111412g;

    /* JADX INFO: renamed from: h */
    public VImage f111413h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f111414i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f111415j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f111416k;

    /* JADX INFO: renamed from: l */
    public View f111417l;

    /* JADX INFO: renamed from: m */
    public AutoVDraweeView f111418m;

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m136953E(Throwable th) {
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        if (user == null) {
            return;
        }
        mp5 mp5VarM159342h = mp5.m159342h();
        ComplimentFromOther complimentFromOtherM159344g = mp5VarM159342h.m159344g(user.f56859id);
        if (mp5VarM159342h.m159345i(user.f56859id)) {
            m136958J(complimentFromOtherM159344g, user);
        } else {
            bnl0.m105524M(m116952m(), false);
            m116950k(m124283w(), mp5VarM159342h.m159343f(user.f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.cs5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83415a.m136958J(user, (ComplimentFromOther) obj);
                }
            }, new y20() { // from class: l.ds5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90457a.m136959K((Throwable) obj);
                }
            }));
        }
        if (gp5.m131228b(m124283w())) {
            gp5.m131236j();
        } else {
            m116950k(m124283w(), ExpandedCardStyleHelper.m39093o().m39112y().filter(new qcj() { // from class: l.es5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ExpandedCardStyleHelper.C8102b) obj).m39118e());
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.fs5
                @Override // p153l.y20
                public final void call(Object obj) {
                    gp5.m131236j();
                }
            }, new y20() { // from class: l.gs5
                @Override // p153l.y20
                public final void call(Object obj) {
                    hs5.m136953E((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m136957I(View view) {
        is5.m141869a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m136959K(Throwable th) {
        bnl0.m105524M(m116952m(), true);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m136958J(ComplimentFromOther complimentFromOther, User user) {
        String str;
        if (complimentFromOther == null) {
            bnl0.m105524M(m116952m(), false);
            return;
        }
        bnl0.m105524M(m116952m(), true);
        VText_NoTopPadding vText_NoTopPadding = this.f111414i;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(m124283w().getString(R$string.f18936V9));
        }
        VText_NoTopPadding vText_NoTopPadding2 = this.f111416k;
        if (vText_NoTopPadding2 != null && (str = complimentFromOther.value) != null) {
            vText_NoTopPadding2.setText(str);
        }
        if (this.f111418m != null) {
            Media media = complimentFromOther.media;
            String strM212781a = media != null ? xr5.m212781a(media) : null;
            if (!TextUtils.isEmpty(strM212781a)) {
                uqb0.f180374G.m127109I0(this.f111418m, strM212781a, qa00.m175859d(64.0f), qa00.m175859d(64.0f));
                bnl0.m105524M(this.f111418m, true);
                return;
            }
            List<Media> list = user.pictures;
            if (list == null || list.isEmpty()) {
                bnl0.m105524M(this.f111418m, false);
            } else {
                uqb0.f180374G.m127125Q0(this.f111418m, user.m61308fp().profileSize(64));
                bnl0.m105524M(this.f111418m, true);
            }
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m136957I(view);
    }
}
