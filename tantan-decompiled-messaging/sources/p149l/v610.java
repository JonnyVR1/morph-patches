package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b#\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\"\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010)R*\u00101\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R*\u00108\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.\"\u0004\b7\u00100¨\u00069"}, m87232d2 = {"Ll/v610;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "callInvite", "", "enableCheck", "", "type", "operationText", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;ZLjava/lang/String;Ljava/lang/String;)V", "Ll/e30;", "action", "Q", "(Ll/e30;)Ll/v610;", "rootAction", j6f.LATITUDE_SOUTH, "", "o", "()I", "itemView", "", "P", "(Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "J", "()Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "b", "Z", "L", "()Z", "c", "Ljava/lang/String;", BloodType.f38728O, "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "e", "K", "R", "(Z)V", "checked", "f", "Ll/e30;", "H", "()Ll/e30;", "setAgreeAction", "(Ll/e30;)V", "agreeAction", "g", "N", "setRootAction", "h", "I", "setAvatarAction", "avatarAction", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class v610 extends d1q<MultiCallNormalItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveMultiCallInvite callInvite;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enableCheck;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String operationText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean checked;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public e30<v610> agreeAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public e30<v610> rootAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public e30<String> avatarAction;

    public v610(@NotNull BLiveMultiCallInvite bLiveMultiCallInvite, boolean z, @NotNull String str, @NotNull String str2) {
        bLiveMultiCallInvite.getClass();
        str.getClass();
        str2.getClass();
        this.callInvite = bLiveMultiCallInvite;
        this.enableCheck = z;
        this.type = str;
        this.operationText = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final e30<v610> m197186H() {
        return this.agreeAction;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final e30<String> m197187I() {
        return this.avatarAction;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final BLiveMultiCallInvite getCallInvite() {
        return this.callInvite;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getEnableCheck() {
        return this.enableCheck;
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public final e30<v610> m197191N() {
        return this.rootAction;
    }

    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull MultiCallNormalItemView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        if (!TextUtils.isEmpty(this.operationText)) {
            itemView.m75775z0(this.operationText);
        }
        itemView.m75770q0(this);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final v610 m197194Q(@Nullable e30<v610> action) {
        this.agreeAction = action;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final void m197195R(boolean z) {
        this.checked = z;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final v610 m197196S(@Nullable e30<v610> rootAction) {
        this.rootAction = rootAction;
        return this;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168497r4;
    }

    public /* synthetic */ v610(BLiveMultiCallInvite bLiveMultiCallInvite, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bLiveMultiCallInvite, z, str, (i & 8) != 0 ? "" : str2);
    }
}
