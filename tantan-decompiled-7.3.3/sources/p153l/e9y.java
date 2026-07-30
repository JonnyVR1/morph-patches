package p153l;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%¨\u0006&"}, m88121d2 = {"Ll/e9y;", "Ll/u4;", "Ll/j8y;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "w", "()V", "Ll/bzl;", ResourceDirection.f39656v, "()Ll/bzl;", "", "showAcceleratePairEntranceEnable", BaseSei.f14624X, "(Z)V", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/lang/Integer;", "", "n", "()Ljava/lang/CharSequence;", "m", "", "u", "()Ljava/util/List;", "", "g", "Ljava/util/List;", "meetEntranceStrategies", "h", "Ll/bzl;", "currentMeetEntranceStrategy", "Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class e9y extends AbstractC20482u4<j8y> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<bzl> meetEntranceStrategies;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public bzl currentMeetEntranceStrategy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showAcceleratePairEntranceEnable;

    public e9y(@Nullable Context context) {
        super(context);
        this.meetEntranceStrategies = new ArrayList();
    }

    @Override // p153l.AbstractC20482u4
    @Nullable
    /* JADX INFO: renamed from: i */
    public Picture.ImageUri mo119959i() {
        bzl bzlVar = this.currentMeetEntranceStrategy;
        if (bzlVar != null) {
            return bzlVar.getAvatar();
        }
        return null;
    }

    @Override // p153l.AbstractC20482u4
    @NotNull
    /* JADX INFO: renamed from: l */
    public Integer mo119960l() {
        int i = dbc0.f86857bf;
        if (gra.m131778z()) {
            i = dbc0.f86890cf;
        }
        bzl bzlVar = this.currentMeetEntranceStrategy;
        return bzlVar != null ? Integer.valueOf(bzlVar.mo107172f()) : Integer.valueOf(i);
    }

    @Override // p153l.AbstractC20482u4
    @NotNull
    /* JADX INFO: renamed from: m */
    public CharSequence mo119961m() {
        CharSequence charSequenceMo107173g;
        bzl bzlVar = this.currentMeetEntranceStrategy;
        return (bzlVar == null || (charSequenceMo107173g = bzlVar.mo107173g()) == null) ? "" : charSequenceMo107173g;
    }

    @Override // p153l.AbstractC20482u4
    @NotNull
    /* JADX INFO: renamed from: n */
    public CharSequence mo119962n() {
        CharSequence title;
        bzl bzlVar = this.currentMeetEntranceStrategy;
        return (bzlVar == null || (title = bzlVar.getTitle()) == null) ? "" : title;
    }

    /* JADX INFO: renamed from: u */
    public final List<bzl> m119963u() {
        this.meetEntranceStrategies.clear();
        boolean zM146361M3 = joa.m146361M3();
        List<bzl> list = this.meetEntranceStrategies;
        if (zM146361M3) {
            list.add(new g9y());
            this.meetEntranceStrategies.add(new d9y());
        } else {
            list.add(new d9y());
            this.meetEntranceStrategies.add(new g9y());
        }
        this.meetEntranceStrategies.add(new x8y());
        this.meetEntranceStrategies.add(new i8y());
        this.meetEntranceStrategies.add(new z8y());
        this.meetEntranceStrategies.add(new l8y());
        return this.meetEntranceStrategies;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final bzl getCurrentMeetEntranceStrategy() {
        return this.currentMeetEntranceStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m119965w() {
        for (bzl bzlVar : m119963u()) {
            bzl bzlVar2 = this.currentMeetEntranceStrategy;
            if ((bzlVar2 instanceof d9y) || (bzlVar2 instanceof g9y) || (bzlVar2 instanceof x8y)) {
                m119966x(true);
            } else if ((bzlVar2 instanceof l8y) || (bzlVar2 instanceof z8y)) {
                m119966x(false);
            }
            T t = this.f177418b;
            t.getClass();
            if (bzlVar.mo107168b((j8y) t, this.showAcceleratePairEntranceEnable)) {
                this.currentMeetEntranceStrategy = bzlVar;
                if (bzlVar instanceof i8y) {
                    m119966x(false);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m119966x(boolean showAcceleratePairEntranceEnable) {
        this.showAcceleratePairEntranceEnable = showAcceleratePairEntranceEnable;
    }
}
