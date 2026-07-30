package com.p051p1.mobile.putong.core.newui.newmeet.frag.odiamond;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.q450;
import p153l.s450;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/q450;", "Ll/s450;", "<init>", "()V", "O4", "()Ll/q450;", "P4", "()Ll/s450;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "Q4", "(IILandroid/content/Intent;)Z", "", "B", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ODiamondFrag extends PutongMvpFrag<q450, s450> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final String url = "/business/meet/v-/2.x/sources/MeetVisitorPageMua.lua?_bid=1003470";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag$a;", "", "<init>", "()V", "", "reportOpenState", "", "from", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "a", "(ZLjava/lang/String;)Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "FROM_MEET", "Ljava/lang/String;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ODiamondFrag m44041b(Companion companion, boolean z, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.m44042a(z, str);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ODiamondFrag m44042a(boolean reportOpenState, @Nullable String from) {
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

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public q450 mo30639M4() {
        return new q450(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public s450 mo30640N4() {
        return new s450(this);
    }

    /* JADX INFO: renamed from: Q4 */
    public final boolean m44040Q4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((q450) this.f17894z).m175199h0(requestCode, resultCode, data);
    }
}
