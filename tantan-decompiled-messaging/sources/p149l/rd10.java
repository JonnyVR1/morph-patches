package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p046p1.mobile.putong.live.base.view.RollItemView;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallFriendsRollUserView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p147v.VButton;
import p147v.VImage;
import p147v.VRadioButton;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u001f\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/rd10;", "Ll/a6t;", "Ll/td10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallTurnOnGuide;", "guideInfo", "", BaseSei.f13932Z, "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallTurnOnGuide;)V", "", "k", "()I", "", "e", "()Z", "E", "()V", "B", "Ll/mqv;", "Ll/j5d0;", "user", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "A", "(Ll/mqv;)Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class rd10 extends a6t<td10<?>> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public rd10(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: C */
    public static final RollItemView m178849C(rd10 rd10Var, mqv mqvVar) {
        return rd10Var.m178854A(mqvVar);
    }

    /* JADX INFO: renamed from: v */
    public static Unit m178850v(rd10 rd10Var, LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide, View view) {
        view.getClass();
        rd10Var.m178856E();
        String reason = multiCallTurnOnGuide.getReason();
        reason.getClass();
        zi10.m218895f(reason, "close", rd10Var.f67800k.isSelected());
        rd10Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static Unit m178851w(rd10 rd10Var, View view) {
        view.getClass();
        VRadioButton vRadioButton = rd10Var.f67800k;
        vRadioButton.setSelected(!vRadioButton.isSelected());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static Unit m178852x(LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide, rd10 rd10Var, View view) {
        view.getClass();
        String reason = multiCallTurnOnGuide.getReason();
        reason.getClass();
        zi10.m218895f(reason, BLiveVoiceSingTogehterState.confirm, rd10Var.f67800k.isSelected());
        td10 td10Var = (td10) rd10Var.f47706b;
        String schema = multiCallTurnOnGuide.getSchema();
        schema.getClass();
        td10Var.m188064R3(schema);
        rd10Var.m178856E();
        rd10Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final MultiCallFriendsRollUserView m178854A(mqv<j5d0> user) {
        View viewM72017c = new MultiCallFriendsRollUserView(this.context, null, 2, null).m72017c(LayoutInflater.from(this.context), null);
        if (viewM72017c instanceof MultiCallFriendsRollUserView) {
            if (user == null) {
                ((MultiCallFriendsRollUserView) viewM72017c).m75713d();
            } else {
                MultiCallFriendsRollUserView multiCallFriendsRollUserView = (MultiCallFriendsRollUserView) viewM72017c;
                multiCallFriendsRollUserView.setRollBackground(i3c0.f111221x7);
                multiCallFriendsRollUserView.setViewPadding(t100.f167255d);
                multiCallFriendsRollUserView.mo68836a(user);
            }
        }
        viewM72017c.getClass();
        return (MultiCallFriendsRollUserView) viewM72017c;
    }

    /* JADX INFO: renamed from: B */
    public final void m178855B(LongLinkMultiCallMessage.MultiCallTurnOnGuide guideInfo) {
        ArrayList arrayList = new ArrayList();
        List<String> avatarsList = guideInfo.getAvatarsList();
        avatarsList.getClass();
        Iterator<T> it = avatarsList.iterator();
        while (it.hasNext()) {
            mqv mqvVarM155998f = mqv.m155998f(new j5d0(0, (String) it.next(), 1, null));
            mqvVarM155998f.getClass();
            arrayList.add(mqvVarM155998f);
        }
        MultiCallRollAnimView multiCallRollAnimView = this.f67795f;
        multiCallRollAnimView.setUsers(CollectionsKt.toList(arrayList));
        multiCallRollAnimView.setItemViewFunc(new w9j() { // from class: l.qd10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rd10.m178849C(this.f153860a, (mqv) obj);
            }
        });
        multiCallRollAnimView.setDelay(2500);
        multiCallRollAnimView.requestDisallowInterceptTouchEvent(true);
        multiCallRollAnimView.m68832O();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E */
    public final void m178856E() {
        if (this.f67800k.isChecked()) {
            LivingNormalApiProvider.m71349T7(((td10) this.f47706b).m206027E2().m149814k());
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: e */
    public boolean mo71724e() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111117p;
    }

    /* JADX INFO: renamed from: z */
    public void m178857z(@NotNull final LongLinkMultiCallMessage.MultiCallTurnOnGuide guideInfo) {
        guideInfo.getClass();
        m178855B(guideInfo);
        this.f67798i.setText(guideInfo.getContent());
        this.f67797h.setText(guideInfo.getTitle());
        VRadioButton vRadioButton = this.f67800k;
        vRadioButton.getClass();
        cxq.m109105c(vRadioButton, new Function1() { // from class: l.nd10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rd10.m178851w(this.f138246a, (View) obj);
            }
        });
        VButton vButton = this.f67799j;
        vButton.getClass();
        cxq.m109105c(vButton, new Function1() { // from class: l.od10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rd10.m178852x(guideInfo, this, (View) obj);
            }
        });
        VImage vImage = this.f67796g;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.pd10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rd10.m178850v(this.f148251a, guideInfo, (View) obj);
            }
        });
    }
}
