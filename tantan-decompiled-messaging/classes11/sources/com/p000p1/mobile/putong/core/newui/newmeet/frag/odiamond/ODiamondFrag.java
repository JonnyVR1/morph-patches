package com.p000p1.mobile.putong.core.newui.newmeet.frag.odiamond;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.bw40;
import p009l.dw40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/bw40;", "Ll/dw40;", "<init>", "()V", "O4", "()Ll/bw40;", "P4", "()Ll/dw40;", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "Q4", "(IILandroid/content/Intent;)Z", "", "B", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ODiamondFrag extends PutongMvpFrag<bw40, dw40> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final String url = "/business/meet/v-/2.x/sources/MeetVisitorPageMua.lua?_bid=1003470";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag$a;", "", "<init>", "()V", "", "reportOpenState", "", "from", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "a", "(ZLjava/lang/String;)Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "FROM_MEET", "Ljava/lang/String;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ODiamondFrag m7232b(Companion companion, boolean z, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.m7233a(z, str);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ODiamondFrag m7233a(boolean reportOpenState, @Nullable String from) {
            ODiamondFrag oDiamondFrag = new ODiamondFrag();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(from)) {
                bundle.putString("from", from);
            }
            bundle.putBoolean("odiamond_weekly_report_open", reportOpenState);
            oDiamondFrag.setArguments(bundle);
            return oDiamondFrag;
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public bw40 m7227M4() {
        return new bw40(this);
    }

    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public dw40 m7228N4() {
        return new dw40(this);
    }

    /* JADX INFO: renamed from: Q4 */
    public final boolean m7231Q4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((bw40) ((PutongMvpFrag) this).z).m12311h0(requestCode, resultCode, data);
    }
}
