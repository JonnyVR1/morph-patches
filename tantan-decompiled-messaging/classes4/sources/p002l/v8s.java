package p002l;

import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.vap.mix.c;
import java.util.Objects;
import l.e30;
import l.ff50;
import l.ffw;
import l.hxs;
import l.jo0;
import l.t100;
import l.uep0;
import l.x9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v8s extends AbstractC0781q4 {

    /* JADX INFO: renamed from: d */
    public VapPlayerView f21036d;

    public <V extends ho2> v8s(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    private void m23793g() {
        if (this.f21036d == null) {
            ?? vapPlayerView = new VapPlayerView(this.f17799c.getContext());
            this.f21036d = vapPlayerView;
            xdl0.M((View) vapPlayerView, false);
        }
        if (this.f21036d.getParent() == null) {
            this.f17799c.addView((View) this.f21036d, xdl0.e, t100.d(100.0f));
        }
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: a */
    public boolean mo7854a() {
        VapPlayerView vapPlayerView = this.f21036d;
        return vapPlayerView != null && vapPlayerView.m7822o();
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: b */
    public void mo7855b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo7855b(bLiveEnterRoom);
        m23793g();
        VapPlayerView vapPlayerView = this.f21036d;
        k8s<?> k8sVar = this.f17797a;
        Objects.requireNonNull(k8sVar);
        vapPlayerView.m7826u(new p8s(k8sVar));
        m23798l(bLiveEnterRoom);
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: c */
    public void mo7856c() {
        super.mo7856c();
        VapPlayerView vapPlayerView = this.f21036d;
        if (vapPlayerView != null && vapPlayerView.m7822o()) {
            this.f21036d.m7825r();
        }
        uep0.E(this.f21036d, (View.OnClickListener) null);
        uep0.v(this.f21036d, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m23794h(BLiveEnterRoom bLiveEnterRoom, Pair pair, BLiveEffect bLiveEffect) {
        m23796j(bLiveEnterRoom, pair);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m23795i(BLiveEnterRoom bLiveEnterRoom, c cVar) {
        this.f17797a.m16566Y3(bLiveEnterRoom.uid);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m23796j(final BLiveEnterRoom bLiveEnterRoom, final Pair<Bitmap, Bitmap> pair) {
        BLiveEffect bLiveEffectM22602b = spe.m22602b(bLiveEnterRoom.getMixResId(), new e30() { // from class: l.t8s
            public final void call(Object obj) {
                this.f20130a.m23794h(bLiveEnterRoom, pair, (BLiveEffect) obj);
            }
        });
        if (bLiveEffectM22602b == null) {
            return;
        }
        this.f17797a.m16567Z3(this.f21036d);
        this.f21036d.setOnResourceClickListener(new ff50() { // from class: l.u8s
            /* JADX INFO: renamed from: a */
            public final void m23340a(c cVar) {
                this.f20540a.m23795i(bLiveEnterRoom, cVar);
            }
        });
        this.f21036d.m7827v(bLiveEnterRoom, bLiveEffectM22602b, pair);
    }

    /* JADX INFO: renamed from: l */
    public final void m23798l(final BLiveEnterRoom bLiveEnterRoom) {
        this.f17797a.duringCreated(rx.c.zip(hxs.e("context_livingAct", bLiveEnterRoom.userImage), hxs.e("context_livingAct", bLiveEnterRoom.userGradeIcon), new x9j() { // from class: l.r8s
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Bitmap) obj, (Bitmap) obj2);
            }
        })).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.s8s
            public final void call(Object obj) {
                this.f18839a.m23796j(bLiveEnterRoom, (Pair) obj);
            }
        }));
    }
}
