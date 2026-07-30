package p149l;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%¨\u0006&"}, m87232d2 = {"Ll/h0y;", "Ll/w4;", "Ll/mzx;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "w", "()V", "Ll/jwl;", ResourceDirection.f38808v, "()Ll/jwl;", "", "showAcceleratePairEntranceEnable", BaseSei.f13930X, "(Z)V", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/lang/Integer;", "", "n", "()Ljava/lang/CharSequence;", "m", "", "u", "()Ljava/util/List;", "", "g", "Ljava/util/List;", "meetEntranceStrategies", "h", "Ll/jwl;", "currentMeetEntranceStrategy", "Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class h0y extends AbstractC20796w4<mzx> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<jwl> meetEntranceStrategies;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public jwl currentMeetEntranceStrategy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showAcceleratePairEntranceEnable;

    public h0y(@Nullable Context context) {
        super(context);
        this.meetEntranceStrategies = new ArrayList();
    }

    @Override // p149l.AbstractC20796w4
    @Nullable
    /* JADX INFO: renamed from: i */
    public Picture.ImageUri mo128981i() {
        jwl jwlVar = this.currentMeetEntranceStrategy;
        if (jwlVar != null) {
            return jwlVar.getAvatar();
        }
        return null;
    }

    @Override // p149l.AbstractC20796w4
    @NotNull
    /* JADX INFO: renamed from: l */
    public Integer mo128982l() {
        int i = x2c0.f190393ne;
        if (upa.m194847z()) {
            i = x2c0.f190425oe;
        }
        jwl jwlVar = this.currentMeetEntranceStrategy;
        return jwlVar != null ? Integer.valueOf(jwlVar.mo104779f()) : Integer.valueOf(i);
    }

    @Override // p149l.AbstractC20796w4
    @NotNull
    /* JADX INFO: renamed from: m */
    public CharSequence mo128983m() {
        CharSequence charSequenceMo104780g;
        jwl jwlVar = this.currentMeetEntranceStrategy;
        return (jwlVar == null || (charSequenceMo104780g = jwlVar.mo104780g()) == null) ? "" : charSequenceMo104780g;
    }

    @Override // p149l.AbstractC20796w4
    @NotNull
    /* JADX INFO: renamed from: n */
    public CharSequence mo128984n() {
        CharSequence title;
        jwl jwlVar = this.currentMeetEntranceStrategy;
        return (jwlVar == null || (title = jwlVar.getTitle()) == null) ? "" : title;
    }

    /* JADX INFO: renamed from: u */
    public final List<jwl> m128985u() {
        this.meetEntranceStrategies.clear();
        boolean zM210047L3 = xma.m210047L3();
        List<jwl> list = this.meetEntranceStrategies;
        if (zM210047L3) {
            list.add(new j0y());
            this.meetEntranceStrategies.add(new g0y());
        } else {
            list.add(new g0y());
            this.meetEntranceStrategies.add(new j0y());
        }
        this.meetEntranceStrategies.add(new a0y());
        this.meetEntranceStrategies.add(new lzx());
        this.meetEntranceStrategies.add(new c0y());
        this.meetEntranceStrategies.add(new ozx());
        return this.meetEntranceStrategies;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final jwl getCurrentMeetEntranceStrategy() {
        return this.currentMeetEntranceStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m128987w() {
        for (jwl jwlVar : m128985u()) {
            jwl jwlVar2 = this.currentMeetEntranceStrategy;
            if ((jwlVar2 instanceof g0y) || (jwlVar2 instanceof j0y) || (jwlVar2 instanceof a0y)) {
                m128988x(true);
            } else if ((jwlVar2 instanceof ozx) || (jwlVar2 instanceof c0y)) {
                m128988x(false);
            }
            T t = this.f184459b;
            t.getClass();
            if (jwlVar.mo94500b((mzx) t, this.showAcceleratePairEntranceEnable)) {
                this.currentMeetEntranceStrategy = jwlVar;
                if (jwlVar instanceof lzx) {
                    m128988x(false);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m128988x(boolean showAcceleratePairEntranceEnable) {
        this.showAcceleratePairEntranceEnable = showAcceleratePairEntranceEnable;
    }
}
