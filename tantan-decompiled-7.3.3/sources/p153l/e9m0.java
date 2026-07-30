package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u00011B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ3\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u001d\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m88121d2 = {"Ll/e9m0;", "Ll/rwn0;", "D", "Ll/qct;", "Ll/c6m;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", "N3", "()V", "init", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "L3", "()Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", p7f.GPS_DIRECTION_TRUE, "type", "Ll/z20;", "", "action", "Landroid/view/ViewGroup;", "viewContainer", "O3", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;Ll/z20;Landroid/view/ViewGroup;)V", "n", "", "Ll/a9m0;", "launchData", "M3", "(Ljava/util/List;)V", "P3", RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "", "Ll/lq2;", "j", "Ljava/util/List;", "motionList", "k", "curMotionCreator", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "currentMotionType", "", "m", "Z", "isSwitchLiveMode", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class e9m0<D extends rwn0> extends qct<D> implements c6m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<lq2<?, ?>> motionList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<lq2<?, ?>> curMotionCreator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public VirtualVoiceMotionType currentMotionType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isSwitchLiveMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9m0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
        this.motionList = new ArrayList();
        this.curMotionCreator = new ArrayList();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m119933J3(e9m0 e9m0Var, List list) {
        e9m0Var.m119939P3();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a9m0 a9m0Var = (a9m0) it.next();
            VirtualVoiceMotionType virtualVoiceMotionType = a9m0Var.f69057b;
            virtualVoiceMotionType.getClass();
            z20<Integer, VirtualVoiceMotionType> z20Var = a9m0Var.f69059d;
            ViewGroup viewGroup = a9m0Var.f69056a;
            viewGroup.getClass();
            e9m0Var.m119938O3(virtualVoiceMotionType, z20Var, viewGroup);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static void m119934K3(e9m0 e9m0Var, b9m0 b9m0Var) {
        try {
            Boolean bool = b9m0Var.f75596a;
            bool.getClass();
            e9m0Var.isSwitchLiveMode = bool.booleanValue();
            List<a9m0> list = b9m0Var.f75597b;
            list.getClass();
            e9m0Var.m119937M3(list);
        } catch (Exception e) {
            fhw.m125605a("[voice][ktv]", "模式切换失败：" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: N3 */
    private final void m119935N3() {
        this.motionList.add(new ggn0(this.curInfo, this));
        this.motionList.add(new g9d0(this.curInfo, this));
        this.motionList.add(new js40(this.curInfo, this));
        this.motionList.add(new vew(this.curInfo, this));
        this.motionList.add(new ob3(this.curInfo, this));
        this.motionList.add(new lkj(this.curInfo, this));
    }

    @Nullable
    /* JADX INFO: renamed from: L3, reason: from getter */
    public final VirtualVoiceMotionType getCurrentMotionType() {
        return this.currentMotionType;
    }

    /* JADX INFO: renamed from: M3 */
    public final void m119937M3(final List<? extends a9m0> launchData) {
        if (this.isSwitchLiveMode) {
            Iterator<T> it = this.curMotionCreator.iterator();
            while (it.hasNext()) {
                ((lq2) it.next()).mo129546p();
            }
            l51.m152888H(act(), new Runnable() { // from class: l.d9m0
                @Override // java.lang.Runnable
                public final void run() {
                    e9m0.m119933J3(this.f85795a, launchData);
                }
            }, 250L);
            return;
        }
        m119939P3();
        for (a9m0 a9m0Var : launchData) {
            VirtualVoiceMotionType virtualVoiceMotionType = a9m0Var.f69057b;
            virtualVoiceMotionType.getClass();
            z20<Integer, VirtualVoiceMotionType> z20Var = a9m0Var.f69059d;
            ViewGroup viewGroup = a9m0Var.f69056a;
            viewGroup.getClass();
            m119938O3(virtualVoiceMotionType, z20Var, viewGroup);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m119938O3(@NotNull VirtualVoiceMotionType type, @Nullable z20<Integer, VirtualVoiceMotionType> action, @NotNull ViewGroup viewContainer) {
        Object next;
        type.getClass();
        viewContainer.getClass();
        Iterator<T> it = this.curMotionCreator.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((lq2) next).m155311l(type.toString()));
        lq2 lq2Var = (lq2) next;
        if (lq2Var != null) {
            if (!lq2Var.m155303b(type)) {
                if (action != null) {
                    action.call(1, lq2Var.m155309j());
                    return;
                }
                return;
            }
            lq2Var.m155307f();
        }
        List list = CollectionsKt.toList(this.motionList);
        String string = type.toString();
        string.getClass();
        lq2<?, ?> lq2VarM123634d = f2m0.m123634d(list, string);
        if (lq2VarM123634d == null) {
            if (action != null) {
                action.call(2, VirtualVoiceMotionType.get("unknown_"));
            }
        } else {
            this.curMotionCreator.add(lq2VarM123634d);
            lq2VarM123634d.m155305d(this, viewContainer);
            lq2VarM123634d.mo129544m(type);
            if (this.isSwitchLiveMode) {
                lq2VarM123634d.mo129545o();
            }
            this.currentMotionType = type;
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m119939P3() {
        Iterator<T> it = this.curMotionCreator.iterator();
        while (it.hasNext()) {
            ((lq2) it.next()).m155312n();
        }
        this.curMotionCreator.clear();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().VoiceVirtualLiveEvent.motionSwitch().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.c9m0
            @Override // p153l.y20
            public final void call(Object obj) {
                e9m0.m119934K3(this.f80504a, (b9m0) obj);
            }
        }));
    }

    public final void init() {
        m119935N3();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m119939P3();
        this.currentMotionType = null;
    }
}
