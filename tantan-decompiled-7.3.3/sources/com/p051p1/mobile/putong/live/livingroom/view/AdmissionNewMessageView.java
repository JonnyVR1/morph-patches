package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.immomo.velib.anim.model.Element;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VText;
import p153l.AbstractC18340l4;
import p153l.bnl0;
import p153l.ere;
import p153l.fn2;
import p153l.hre;
import p153l.i0k;
import p153l.it0;
import p153l.izs;
import p153l.jfl0;
import p153l.jhe;
import p153l.jyb;
import p153l.muj;
import p153l.n3d0;
import p153l.qim;
import p153l.t90;
import p153l.udl0;
import p153l.und0;
import p153l.vxr;
import p153l.wp0;
import p153l.wqe;
import p153l.ye2;
import p153l.z20;

/* JADX INFO: loaded from: classes5.dex */
public class AdmissionNewMessageView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52683a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52684b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52685c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52686d;

    /* JADX INFO: renamed from: e */
    public LiveGradientTextView f52687e;

    /* JADX INFO: renamed from: f */
    public VText f52688f;

    /* JADX INFO: renamed from: g */
    public VideoEffectPlayer f52689g;

    /* JADX INFO: renamed from: h */
    public MomoLayUpSVGAImageView f52690h;

    /* JADX INFO: renamed from: i */
    public XEGiftView f52691i;

    /* JADX INFO: renamed from: j */
    public BLiveEnterRoom f52692j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f52693k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView$a */
    public class C13077a extends fn2 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView$a$a */
        public class a extends ye2 {

            /* JADX INFO: renamed from: a */
            public int f52695a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f52696b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ wp0 f52697c;

            public a(int i, wp0 wp0Var) {
                this.f52696b = i;
                this.f52697c = wp0Var;
            }

            @Override // p153l.ye2, p153l.lr0
            /* JADX INFO: renamed from: a */
            public void mo77568a(@NonNull Drawable drawable, int i) {
                int i2 = this.f52695a;
                if ((i2 != 0 || this.f52696b > 1) && i2 <= i) {
                    this.f52695a = i;
                } else {
                    this.f52697c.stop();
                }
            }

            @Override // p153l.ye2, p153l.lr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f52695a = -1;
            }
        }

        public C13077a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            wp0 wp0Var = (wp0) animatable;
            wp0Var.m207396j(new a(wp0Var.m207391e(), wp0Var));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView$b */
    public class C13078b extends SVGAAnimListenerAdapter {
        public C13078b() {
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(String str) {
            super.loadResError(str);
            bnl0.m105524M(AdmissionNewMessageView.this.f52690h, false);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(AdmissionNewMessageView.this.f52690h, false);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            bnl0.m105524M(AdmissionNewMessageView.this.f52690h, true);
        }
    }

    public AdmissionNewMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m77557b(View view) {
        t90.m189710a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m77558c(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
        if (jyb.m147479J(list) || jyb.m147479J(list2)) {
            return;
        }
        HashMap map = new HashMap(list.size());
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.f45286id, bLiveSpecialEffectResources);
        }
        for (Element element : list2) {
            String id = element.getId();
            BLiveSpecialEffectResources bLiveSpecialEffectResources2 = (BLiveSpecialEffectResources) map.get(id);
            if (map.containsKey(id) && bLiveSpecialEffectResources2 != null) {
                if (bLiveSpecialEffectResources2.typeIsImageUrl()) {
                    element.setUrl(bLiveSpecialEffectResources2.value);
                } else if (bLiveSpecialEffectResources2.typeIsText()) {
                    element.setText(bLiveSpecialEffectResources2.value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m77559d() {
        AnimatorSet animatorSet = this.f52693k;
        if (animatorSet != null) {
            it0.m142009C(animatorSet);
        }
        this.f52683a.setBackgroundResource(0);
        VideoEffectPlayer videoEffectPlayer = this.f52689g;
        if (videoEffectPlayer != null) {
            bnl0.m105524M(videoEffectPlayer, false);
            this.f52689g.stop();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m77560e() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m77561f(BLiveEnterRoom bLiveEnterRoom, udl0 udl0Var, BLiveEffect bLiveEffect) {
        if (jyb.m147479J(udl0Var.m195499b()) || bLiveEnterRoom == null || jyb.m147479J(bLiveEnterRoom.videoEffectExtras)) {
            return;
        }
        m77558c(bLiveEnterRoom.videoEffectExtras, udl0Var.m195499b());
    }

    /* JADX INFO: renamed from: g */
    public void m77562g(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        if (vxr.m203876d().m170973E1()) {
            m77565j(bLiveEnterRoom, bLiveEffect);
        } else if ("svga".equals(bLiveEffect.type)) {
            m77563h(bLiveEnterRoom, bLiveEffect);
        } else if ("video".equals(bLiveEffect.type)) {
            m77564i(bLiveEnterRoom, bLiveEffect);
        }
    }

    public String getUid() {
        BLiveEnterRoom bLiveEnterRoom = this.f52692j;
        if (bLiveEnterRoom != null) {
            return bLiveEnterRoom.uid;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m77563h(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        JSONObject jSONObject;
        if (this.f52690h == null) {
            return;
        }
        AbstractC18340l4 abstractC18340l4M207509d = wqe.m207509d("svga");
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", abstractC18340l4M207509d.mo144686b(ere.m122146i().m122151h(bLiveEffect.f45207id)));
            } catch (JSONException unused) {
                muj.m160158A(bLiveEffect);
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        this.f52690h.clearInsertData();
        this.f52690h.startSVGAAnimWithLayJson(jSONObject.toString(), 1, null, new C13078b());
    }

    /* JADX INFO: renamed from: i */
    public final void m77564i(final BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        jfl0.m144685n(this.f52689g, new hre(bLiveEffect.f45207id).m136831n(new z20() { // from class: l.s90
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f166874a.m77561f(bLiveEnterRoom, (udl0) obj, (BLiveEffect) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m77565j(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        jhe.m144897r(this.f52691i, new hre(bLiveEnterRoom.getMixResId()).m136827j(bLiveEnterRoom.dynamicEffectExtends).m136828k(bLiveEnterRoom.videoEffectExtras));
    }

    /* JADX INFO: renamed from: k */
    public final void m77566k(BLiveEnterRoom bLiveEnterRoom) {
        izs.m142872w("context_livingAct", this.f52684b, bLiveEnterRoom.newFloatingUrl, new C13077a());
    }

    /* JADX INFO: renamed from: l */
    public void m77567l(BLiveEnterRoom bLiveEnterRoom) {
        if (bLiveEnterRoom == null) {
            return;
        }
        this.f52692j = bLiveEnterRoom;
        izs.m142868s("context_livingAct", this.f52683a, bLiveEnterRoom.fixedBackgroundUrl);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveEnterRoom.userGradeIcon);
        VDraweeView vDraweeView = this.f52685c;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            i0k.m137976c(bLiveEnterRoom.userGradeIcon, this.f52685c, i0k.f112378a);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveEnterRoom.userImage);
        VDraweeView vDraweeView2 = this.f52686d;
        if (zIsEmpty2) {
            bnl0.m105524M(vDraweeView2, false);
            this.f52687e.setMaxEms(7);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            izs.m142868s("context_livingAct", this.f52686d, bLiveEnterRoom.userImage);
            this.f52687e.setMaxEms(6);
        }
        und0.m196834b(this.f52687e, bLiveEnterRoom.userName, n3d0.m161283g(bLiveEnterRoom.userNameColor), bLiveEnterRoom.userNameGradientColors);
        this.f52688f.setText(bLiveEnterRoom.getContentText(getContext()));
        this.f52688f.setTextColor(n3d0.m161283g(bLiveEnterRoom.contentTextColor));
        if (TextUtils.isEmpty(bLiveEnterRoom.newFloatingUrl)) {
            bnl0.m105525M0(this.f52684b, false);
        } else {
            m77566k(bLiveEnterRoom);
            bnl0.m105525M0(this.f52684b, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77557b(this);
        this.f52689g.setRenderMode(2);
    }

    public void setAnim(AnimatorSet animatorSet) {
        this.f52693k = animatorSet;
    }

    public AdmissionNewMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdmissionNewMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
