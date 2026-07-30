package p149l;

import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 #2\u00020\u0001:\u0001\u000fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0012\u0010\"¨\u0006$"}, m87232d2 = {"Ll/zfm0;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "title", "Landroid/view/ViewGroup;", OMSTemplateModeType.view, "Ll/ahm0;", "tabAction", "", "isSelected", "", "position", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/ViewGroup;Ll/ahm0;ZI)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", Constants.INAPP_DATA_TAG, "c", "Landroid/view/ViewGroup;", "e", "()Landroid/view/ViewGroup;", "h", "(Landroid/view/ViewGroup;)V", "Ll/ahm0;", "()Ll/ahm0;", "Z", "f", "()Z", "g", "(Z)V", "I", "()I", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zfm0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ViewGroup view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final ahm0 tabAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isSelected;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int position;

    public zfm0(@NotNull String str, @NotNull String str2, @Nullable ViewGroup viewGroup, @Nullable ahm0 ahm0Var, boolean z, int i) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.title = str2;
        this.view = viewGroup;
        this.tabAction = ahm0Var;
        this.isSelected = z;
        this.position = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ahm0 getTabAction() {
        return this.tabAction;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ViewGroup getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: g */
    public final void m218489g(boolean z) {
        this.isSelected = z;
    }

    /* JADX INFO: renamed from: h */
    public final void m218490h(@Nullable ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    /* JADX INFO: renamed from: l.zfm0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m87232d2 = {"Ll/zfm0$a;", "", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)Z", "KEY_AUCTION_APPLY", "Ljava/lang/String;", "KEY_AUCTION_INVITE", "KEY_AUCTION_LIST", "KEY_PERSONAL", "KEY_ALL_LEADER_BOARD", "KEY_TODAY_LEADER_BOARD", "KEY_GLOBAL_LEADER_BOARD", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m218491a(@NotNull String name) {
            name.getClass();
            return Intrinsics.m87488d(name, "personal") || Intrinsics.m87488d(name, "leaderboard");
        }

        public Companion() {
        }
    }

    public /* synthetic */ zfm0(String str, String str2, ViewGroup viewGroup, ahm0 ahm0Var, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : viewGroup, (i2 & 8) != 0 ? null : ahm0Var, (i2 & 16) != 0 ? false : z, i);
    }
}
