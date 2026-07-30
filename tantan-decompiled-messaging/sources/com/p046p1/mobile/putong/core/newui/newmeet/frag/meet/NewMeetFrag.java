package com.p046p1.mobile.putong.core.newui.newmeet.frag.meet;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.vwb;
import p149l.xma;
import p149l.zi30;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;", "Ll/zi30;", "<init>", "()V", "", "d4", "O4", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;", "P4", "()Ll/zi30;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "Q4", "(IILandroid/content/Intent;)Z", "", "pageId", "()Ljava/lang/String;", "disableAutoPV", "()Z", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NewMeetFrag extends PutongMvpFrag<NewMeetFragPresenter, zi30> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFrag$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag$a;", "", "<init>", "()V", "", "from", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "b", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "Landroid/content/Intent;", "intent", "a", "(Landroid/content/Intent;)Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final NewMeetFrag m42968a(@Nullable Intent intent) {
            return m42969b(intent != null ? intent.getStringExtra("from") : null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: b */
        public final NewMeetFrag m42969b(@Nullable String from) {
            NewMeetFrag newMeetFrag = new NewMeetFrag();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(from)) {
                bundle.putString("from", from);
            }
            newMeetFrag.setArguments(bundle);
            return newMeetFrag;
        }

        public Companion() {
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public NewMeetFragPresenter mo29641M4() {
        return new NewMeetFragPresenter(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public zi30 mo29642N4() {
        return new zi30(act());
    }

    /* JADX INFO: renamed from: Q4 */
    public final boolean m42967Q4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((NewMeetFragPresenter) this.f17175z).m43021k1(requestCode, resultCode, data);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(xma.m210047L3())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return ((zi30) this.f17174A).inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_meet";
    }
}
