package p153l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class tf4 implements iam<qf4> {

    /* JADX INFO: renamed from: a */
    public MKWebView f173918a;

    /* JADX INFO: renamed from: b */
    public View f173919b;

    /* JADX INFO: renamed from: c */
    public ImageView f173920c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f173921d;

    /* JADX INFO: renamed from: e */
    public w0c f173922e;

    /* JADX INFO: renamed from: f */
    public qf4 f173923f;

    /* JADX INFO: renamed from: g */
    public Animator f173924g = null;

    /* JADX INFO: renamed from: h */
    public View f173925h;

    /* JADX INFO: renamed from: l.tf4$a */
    public class C20300a extends dpf0 {
        public C20300a(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            fhw.m125605a("[live]campaign", "onReceivedErrorX message = " + str);
            awr.m100708b(i, str, str2, CampaignItemView.class.getName());
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: h */
        public void mo18130h(WebView webView, int i) {
            super.mo18130h(webView, i);
            if (webView == null) {
                return;
            }
            String url = webView.getUrl();
            if (tf4.this.isShowing() || i != 100 || TextUtils.isEmpty(url) || "about:blank".equals(url)) {
                return;
            }
            bnl0.m105524M(tf4.this.f173925h, true);
            tf4.this.m190926p();
        }
    }

    public tf4(@NonNull FrameLayout frameLayout) {
        this.f173921d = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m190917k(View view) {
        m190923j();
        this.f173923f.m176296T3();
    }

    /* JADX INFO: renamed from: n */
    private void m190918n() {
        this.f173918a.loadUrl("about:blank");
        bnl0.m105524M(this.f173925h, false);
        m190922i();
    }

    /* JADX INFO: renamed from: r */
    private void m190919r() {
        View viewM190920e = m190920e(this.f173923f.act().inflater(), this.f173921d);
        this.f173925h = viewM190920e;
        this.f173924g = gt0.m132166l(viewM190920e, View.TRANSLATION_X, 0L, 300L, new AccelerateInterpolator(), qa00.m175859d(-270.0f), 0.0f);
        w0c w0cVar = new w0c();
        this.f173922e = w0cVar;
        w0cVar.m17975z(this.f173923f.act(), this.f173918a);
        this.f173922e.m204137M((PutongAct) this.f173923f.act(), "", this.f173918a, "");
        this.f173918a.setBackgroundColor(0);
        this.f173918a.setHorizontalScrollBarEnabled(false);
        this.f173918a.setVerticalScrollBarEnabled(false);
        this.f173918a.setMKWebLoadListener(new C20300a(this.f173922e));
        this.f173918a.getSettings().setCacheMode(-1);
        this.f173925h.setLayoutParams(this.f173923f.mo161349U3());
        this.f173921d.addView(this.f173925h);
        this.f173923f.m176296T3();
        bnl0.m105509E0(this.f173920c, new View.OnClickListener() { // from class: l.rf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162759a.m190917k(view);
            }
        });
        bnl0.m105524M(this.f173921d, true);
        bnl0.m105524M(this.f173925h, false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f173921d.getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        m190918n();
        ffv.m125425a(this.f173918a, this.f173922e);
    }

    /* JADX INFO: renamed from: e */
    public View m190920e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uf4.m195821b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qf4 qf4Var) {
        this.f173923f = qf4Var;
        m190919r();
    }

    /* JADX INFO: renamed from: i */
    public final void m190922i() {
        Animator animator = this.f173924g;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f173924g.cancel();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return bnl0.m105529O0(this.f173925h);
    }

    /* JADX INFO: renamed from: j */
    public void m190923j() {
        m190918n();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m190924l(LiveChatAreaOperationMessage.JumpLink jumpLink, View view) {
        this.f173923f.m176296T3();
        m190923j();
        this.f173923f.mo138869p3(1300, jumpLink.getSchema());
    }

    /* JADX INFO: renamed from: m */
    public void m190925m(String str, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        final LiveChatAreaOperationMessage.JumpLink jumpLinkItem = chatAreaOperationSiteContainer.getJumpLinkItem();
        int iM105592y0 = (int) (bnl0.m105592y0() * jumpLinkItem.getWidthScreenRatio());
        int iM105592y1 = (int) ((bnl0.m105592y0() * jumpLinkItem.getWidthScreenRatio()) / jumpLinkItem.getWidthHighRatio());
        HashMap map = new HashMap();
        if (ntp0.m164746d(jumpLinkItem.getUrl()) && !TextUtils.isEmpty(str)) {
            map.put("H5-Authorization", str);
        }
        boolean isClientDeal = jumpLinkItem.getIsClientDeal();
        View view = this.f173919b;
        if (isClientDeal) {
            bnl0.m105524M(view, true);
            bnl0.m105509E0(this.f173919b, new View.OnClickListener() { // from class: l.sf4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f167667a.m190924l(jumpLinkItem, view2);
                }
            });
        } else {
            bnl0.m105509E0(view, null);
            bnl0.m105524M(this.f173919b, false);
        }
        bnl0.m105524M(this.f173920c, jumpLinkItem.getEnableClose());
        bnl0.m105505C0(this.f173925h, iM105592y1);
        bnl0.m105507D0(iM105592y0, this.f173925h);
        this.f173918a.loadUrl(jumpLinkItem.getUrl(), map);
    }

    /* JADX INFO: renamed from: p */
    public final void m190926p() {
        if (this.f173924g.isRunning()) {
            return;
        }
        this.f173924g.start();
    }
}
