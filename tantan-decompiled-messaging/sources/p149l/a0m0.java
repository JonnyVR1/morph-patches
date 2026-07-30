package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u00011B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ3\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u001d\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m87232d2 = {"Ll/a0m0;", "Ll/nnn0;", "D", "Ll/pat;", "Ll/l3m;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", "N3", "()V", "init", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "L3", "()Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", j6f.GPS_DIRECTION_TRUE, "type", "Ll/f30;", "", "action", "Landroid/view/ViewGroup;", "viewContainer", "O3", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;Ll/f30;Landroid/view/ViewGroup;)V", "n", "", "Ll/wzl0;", "launchData", "M3", "(Ljava/util/List;)V", "P3", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "", "Ll/up2;", "j", "Ljava/util/List;", "motionList", "k", "curMotionCreator", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "currentMotionType", "", "m", "Z", "isSwitchLiveMode", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class a0m0<D extends nnn0> extends pat<D> implements l3m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<up2<?, ?>> motionList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<up2<?, ?>> curMotionCreator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public VirtualVoiceMotionType currentMotionType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isSwitchLiveMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0m0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
        this.motionList = new ArrayList();
        this.curMotionCreator = new ArrayList();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m94446J3(a0m0 a0m0Var, List list) {
        a0m0Var.m94452P3();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wzl0 wzl0Var = (wzl0) it.next();
            VirtualVoiceMotionType virtualVoiceMotionType = wzl0Var.f188743b;
            virtualVoiceMotionType.getClass();
            f30<Integer, VirtualVoiceMotionType> f30Var = wzl0Var.f188745d;
            ViewGroup viewGroup = wzl0Var.f188742a;
            viewGroup.getClass();
            a0m0Var.m94451O3(virtualVoiceMotionType, f30Var, viewGroup);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static void m94447K3(a0m0 a0m0Var, xzl0 xzl0Var) {
        try {
            Boolean bool = xzl0Var.f195207a;
            bool.getClass();
            a0m0Var.isSwitchLiveMode = bool.booleanValue();
            List<wzl0> list = xzl0Var.f195208b;
            list.getClass();
            a0m0Var.m94450M3(list);
        } catch (Exception e) {
            hfw.m130790a("[voice][ktv]", "模式切换失败：" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: N3 */
    private final void m94448N3() {
        this.motionList.add(new c7n0(this.curInfo, this));
        this.motionList.add(new d1d0(this.curInfo, this));
        this.motionList.add(new vj40(this.curInfo, this));
        this.motionList.add(new xcw(this.curInfo, this));
        this.motionList.add(new za3(this.curInfo, this));
        this.motionList.add(new rhj(this.curInfo, this));
    }

    @Nullable
    /* JADX INFO: renamed from: L3, reason: from getter */
    public final VirtualVoiceMotionType getCurrentMotionType() {
        return this.currentMotionType;
    }

    /* JADX INFO: renamed from: M3 */
    public final void m94450M3(final List<? extends wzl0> launchData) {
        if (this.isSwitchLiveMode) {
            Iterator<T> it = this.curMotionCreator.iterator();
            while (it.hasNext()) {
                ((up2) it.next()).mo105619p();
            }
            e51.m114743H(act(), new Runnable() { // from class: l.zzl0
                @Override // java.lang.Runnable
                public final void run() {
                    a0m0.m94446J3(this.f205807a, launchData);
                }
            }, 250L);
            return;
        }
        m94452P3();
        for (wzl0 wzl0Var : launchData) {
            VirtualVoiceMotionType virtualVoiceMotionType = wzl0Var.f188743b;
            virtualVoiceMotionType.getClass();
            f30<Integer, VirtualVoiceMotionType> f30Var = wzl0Var.f188745d;
            ViewGroup viewGroup = wzl0Var.f188742a;
            viewGroup.getClass();
            m94451O3(virtualVoiceMotionType, f30Var, viewGroup);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m94451O3(@NotNull VirtualVoiceMotionType type, @Nullable f30<Integer, VirtualVoiceMotionType> action, @NotNull ViewGroup viewContainer) {
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
        } while (!((up2) next).m194593l(type.toString()));
        up2 up2Var = (up2) next;
        if (up2Var != null) {
            if (!up2Var.m194585b(type)) {
                if (action != null) {
                    action.call(1, up2Var.m194591j());
                    return;
                }
                return;
            }
            up2Var.m194589f();
        }
        List list = CollectionsKt.toList(this.motionList);
        String string = type.toString();
        string.getClass();
        up2<?, ?> up2VarM103864d = btl0.m103864d(list, string);
        if (up2VarM103864d == null) {
            if (action != null) {
                action.call(2, VirtualVoiceMotionType.get("unknown_"));
            }
        } else {
            this.curMotionCreator.add(up2VarM103864d);
            up2VarM103864d.m194587d(this, viewContainer);
            up2VarM103864d.mo109608m(type);
            if (this.isSwitchLiveMode) {
                up2VarM103864d.mo105618o();
            }
            this.currentMotionType = type;
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m94452P3() {
        Iterator<T> it = this.curMotionCreator.iterator();
        while (it.hasNext()) {
            ((up2) it.next()).m194594n();
        }
        this.curMotionCreator.clear();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().VoiceVirtualLiveEvent.motionSwitch().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.yzl0
            @Override // p149l.e30
            public final void call(Object obj) {
                a0m0.m94447K3(this.f200897a, (xzl0) obj);
            }
        }));
    }

    public final void init() {
        m94448N3();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m94452P3();
        this.currentMotionType = null;
    }
}
