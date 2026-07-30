package p149l;

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
import com.p046p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ue4 implements s7m<re4> {

    /* JADX INFO: renamed from: a */
    public MKWebView f175997a;

    /* JADX INFO: renamed from: b */
    public View f175998b;

    /* JADX INFO: renamed from: c */
    public ImageView f175999c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f176000d;

    /* JADX INFO: renamed from: e */
    public izb f176001e;

    /* JADX INFO: renamed from: f */
    public re4 f176002f;

    /* JADX INFO: renamed from: g */
    public Animator f176003g = null;

    /* JADX INFO: renamed from: h */
    public View f176004h;

    /* JADX INFO: renamed from: l.ue4$a */
    public class C20413a extends MKWebViewHelper.C14921b {
        public C20413a(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            hfw.m130790a("[live]campaign", "onReceivedErrorX message = " + str);
            ztr.m220137b(i, str, str2, CampaignItemView.class.getName());
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: h */
        public void mo154759h(WebView webView, int i) {
            super.mo154759h(webView, i);
            if (webView == null) {
                return;
            }
            String url = webView.getUrl();
            if (ue4.this.isShowing() || i != 100 || TextUtils.isEmpty(url) || "about:blank".equals(url)) {
                return;
            }
            xdl0.m208344M(ue4.this.f176004h, true);
            ue4.this.m193218p();
        }
    }

    public ue4(@NonNull FrameLayout frameLayout) {
        this.f176000d = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m193209k(View view) {
        m193215j();
        this.f176002f.m179036T3();
    }

    /* JADX INFO: renamed from: n */
    private void m193210n() {
        this.f175997a.loadUrl("about:blank");
        xdl0.m208344M(this.f176004h, false);
        m193214i();
    }

    /* JADX INFO: renamed from: r */
    private void m193211r() {
        View viewM193212e = m193212e(this.f176002f.act().inflater(), this.f176000d);
        this.f176004h = viewM193212e;
        this.f176003g = bt0.m103739l(viewM193212e, View.TRANSLATION_X, 0L, 300L, new AccelerateInterpolator(), t100.m186890d(-270.0f), 0.0f);
        izb izbVar = new izb();
        this.f176001e = izbVar;
        izbVar.m87118q(this.f176002f.act(), this.f175997a);
        this.f176001e.m139034A((PutongAct) this.f176002f.act(), "", this.f175997a, "");
        this.f175997a.setBackgroundColor(0);
        this.f175997a.setHorizontalScrollBarEnabled(false);
        this.f175997a.setVerticalScrollBarEnabled(false);
        this.f175997a.setMKWebLoadListener(new C20413a(this.f176001e));
        this.f175997a.getSettings().setCacheMode(-1);
        this.f176004h.setLayoutParams(this.f176002f.mo143336U3());
        this.f176000d.addView(this.f176004h);
        this.f176002f.m179036T3();
        xdl0.m208329E0(this.f175999c, new View.OnClickListener() { // from class: l.se4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163927a.m193209k(view);
            }
        });
        xdl0.m208344M(this.f176000d, true);
        xdl0.m208344M(this.f176004h, false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176000d.getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        m193210n();
        edv.m115835b(this.f175997a, this.f176001e);
    }

    /* JADX INFO: renamed from: e */
    public View m193212e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ve4.m198155b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(re4 re4Var) {
        this.f176002f = re4Var;
        m193211r();
    }

    /* JADX INFO: renamed from: i */
    public final void m193214i() {
        Animator animator = this.f176003g;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f176003g.cancel();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return xdl0.m208349O0(this.f176004h);
    }

    /* JADX INFO: renamed from: j */
    public void m193215j() {
        m193210n();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m193216l(LiveChatAreaOperationMessage.JumpLink jumpLink, View view) {
        this.f176002f.m179036T3();
        m193215j();
        this.f176002f.mo129310p3(1300, jumpLink.getSchema());
    }

    /* JADX INFO: renamed from: m */
    public void m193217m(String str, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        final LiveChatAreaOperationMessage.JumpLink jumpLinkItem = chatAreaOperationSiteContainer.getJumpLinkItem();
        int iM208412y0 = (int) (xdl0.m208412y0() * jumpLinkItem.getWidthScreenRatio());
        int iM208412y1 = (int) ((xdl0.m208412y0() * jumpLinkItem.getWidthScreenRatio()) / jumpLinkItem.getWidthHighRatio());
        HashMap map = new HashMap();
        if (jkp0.m141904d(jumpLinkItem.getUrl()) && !TextUtils.isEmpty(str)) {
            map.put("H5-Authorization", str);
        }
        boolean isClientDeal = jumpLinkItem.getIsClientDeal();
        View view = this.f175998b;
        if (isClientDeal) {
            xdl0.m208344M(view, true);
            xdl0.m208329E0(this.f175998b, new View.OnClickListener() { // from class: l.te4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f169792a.m193216l(jumpLinkItem, view2);
                }
            });
        } else {
            xdl0.m208329E0(view, null);
            xdl0.m208344M(this.f175998b, false);
        }
        xdl0.m208344M(this.f175999c, jumpLinkItem.getEnableClose());
        xdl0.m208325C0(this.f176004h, iM208412y1);
        xdl0.m208327D0(iM208412y0, this.f176004h);
        this.f175997a.loadUrl(jumpLinkItem.getUrl(), map);
    }

    /* JADX INFO: renamed from: p */
    public final void m193218p() {
        if (this.f176003g.isRunning()) {
            return;
        }
        this.f176003g.start();
    }
}
