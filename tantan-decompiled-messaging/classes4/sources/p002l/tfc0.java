package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUserItemView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d1q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Ll/tfc0;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "Ll/mlj;", "callInfo", "", "index", "Ll/wfc0;", "listener", "<init>", "(Ll/mlj;ILl/wfc0;)V", "o", "()I", "itemView", "", "L", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;)V", "", "", "payloads", "N", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;Ljava/util/List;)V", "a", "Ll/mlj;", "H", "()Ll/mlj;", "b", "I", "c", "Ll/wfc0;", "J", "()Ll/wfc0;", "", "d", "Z", "K", "()Z", "O", "(Z)V", "isPacketMode", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class tfc0 extends d1q<ReceiveGiftUserItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final mlj callInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final wfc0 listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isPacketMode;

    public tfc0(@NotNull mlj mljVar, int i, @NotNull wfc0 wfc0Var) {
        mljVar.getClass();
        wfc0Var.getClass();
        this.callInfo = mljVar;
        this.index = i;
        this.listener = wfc0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final mlj getCallInfo() {
        return this.callInfo;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final wfc0 getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getIsPacketMode() {
        return this.isPacketMode;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m22914u(@NotNull ReceiveGiftUserItemView itemView) {
        itemView.getClass();
        super.u(itemView);
        itemView.m7535e(this);
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m22915v(@NotNull ReceiveGiftUserItemView itemView, @NotNull List<Object> payloads) {
        itemView.getClass();
        payloads.getClass();
        super.v(itemView, payloads);
        if (!payloads.isEmpty() && Intrinsics.d(payloads.get(0), 0)) {
            itemView.m7537g();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m22912O(boolean z) {
        this.isPacketMode = z;
    }

    /* JADX INFO: renamed from: o */
    public int m22913o() {
        return t6c0.f20055w1;
    }
}
