package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p051p1.mobile.putong.live.base.view.RollItemView;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallFriendsRollUserView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p151v.VButton;
import p151v.VImage;
import p151v.VRadioButton;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u001f\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/bm10;", "Ll/b8t;", "Ll/dm10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallTurnOnGuide;", "guideInfo", "", BaseSei.f14626Z, "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallTurnOnGuide;)V", "", "k", "()I", "", "e", "()Z", "E", "()V", "B", "Ll/nsv;", "Ll/mdd0;", "user", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "A", "(Ll/nsv;)Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bm10 extends b8t<dm10<?>> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public bm10(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: C */
    public static final RollItemView m104954C(bm10 bm10Var, nsv nsvVar) {
        return bm10Var.m104959A(nsvVar);
    }

    /* JADX INFO: renamed from: v */
    public static Unit m104955v(bm10 bm10Var, LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide, View view) {
        view.getClass();
        bm10Var.m104961E();
        String reason = multiCallTurnOnGuide.getReason();
        reason.getClass();
        jr10.m146659f(reason, "close", bm10Var.f75475k.isSelected());
        bm10Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static Unit m104956w(bm10 bm10Var, View view) {
        view.getClass();
        VRadioButton vRadioButton = bm10Var.f75475k;
        vRadioButton.setSelected(!vRadioButton.isSelected());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static Unit m104957x(LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide, bm10 bm10Var, View view) {
        view.getClass();
        String reason = multiCallTurnOnGuide.getReason();
        reason.getClass();
        jr10.m146659f(reason, BLiveVoiceSingTogehterState.confirm, bm10Var.f75475k.isSelected());
        dm10 dm10Var = (dm10) bm10Var.f48554b;
        String schema = multiCallTurnOnGuide.getSchema();
        schema.getClass();
        dm10Var.m116939R3(schema);
        bm10Var.m104961E();
        bm10Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final MultiCallFriendsRollUserView m104959A(nsv<mdd0> user) {
        View viewM73200c = new MultiCallFriendsRollUserView(this.context, null, 2, null).m73200c(LayoutInflater.from(this.context), null);
        if (viewM73200c instanceof MultiCallFriendsRollUserView) {
            if (user == null) {
                ((MultiCallFriendsRollUserView) viewM73200c).m76896d();
            } else {
                MultiCallFriendsRollUserView multiCallFriendsRollUserView = (MultiCallFriendsRollUserView) viewM73200c;
                multiCallFriendsRollUserView.setRollBackground(obc0.f146549x7);
                multiCallFriendsRollUserView.setViewPadding(qa00.f156317d);
                multiCallFriendsRollUserView.mo70019a(user);
            }
        }
        viewM73200c.getClass();
        return (MultiCallFriendsRollUserView) viewM73200c;
    }

    /* JADX INFO: renamed from: B */
    public final void m104960B(LongLinkMultiCallMessage.MultiCallTurnOnGuide guideInfo) {
        ArrayList arrayList = new ArrayList();
        List<String> avatarsList = guideInfo.getAvatarsList();
        avatarsList.getClass();
        Iterator<T> it = avatarsList.iterator();
        while (it.hasNext()) {
            nsv nsvVarM164636f = nsv.m164636f(new mdd0(0, (String) it.next(), 1, null));
            nsvVarM164636f.getClass();
            arrayList.add(nsvVarM164636f);
        }
        MultiCallRollAnimView multiCallRollAnimView = this.f75470f;
        multiCallRollAnimView.setUsers(CollectionsKt.toList(arrayList));
        multiCallRollAnimView.setItemViewFunc(new qcj() { // from class: l.am10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bm10.m104954C(this.f72185a, (nsv) obj);
            }
        });
        multiCallRollAnimView.setDelay(2500);
        multiCallRollAnimView.requestDisallowInterceptTouchEvent(true);
        multiCallRollAnimView.m70015O();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: E */
    public final void m104961E() {
        if (this.f75475k.isChecked()) {
            LivingNormalApiProvider.m72532T7(((dm10) this.f48554b).m213810E2().m202191k());
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: e */
    public boolean mo72907e() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146445p;
    }

    /* JADX INFO: renamed from: z */
    public void m104962z(@NotNull final LongLinkMultiCallMessage.MultiCallTurnOnGuide guideInfo) {
        guideInfo.getClass();
        m104960B(guideInfo);
        this.f75473i.setText(guideInfo.getContent());
        this.f75472h.setText(guideInfo.getTitle());
        VRadioButton vRadioButton = this.f75475k;
        vRadioButton.getClass();
        czq.m113347c(vRadioButton, new Function1() { // from class: l.xl10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bm10.m104956w(this.f194836a, (View) obj);
            }
        });
        VButton vButton = this.f75474j;
        vButton.getClass();
        czq.m113347c(vButton, new Function1() { // from class: l.yl10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bm10.m104957x(guideInfo, this, (View) obj);
            }
        });
        VImage vImage = this.f75471g;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.zl10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bm10.m104955v(this.f204874a, guideInfo, (View) obj);
            }
        });
    }
}
