package com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ha20;
import p153l.ka20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/ha20;", "Ll/ka20;", "<init>", "()V", "O4", "()Ll/ha20;", "P4", "()Ll/ka20;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MyVisitorsFrag extends PutongMvpFrag<ha20, ka20> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorsFrag$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag$a;", "", "<init>", "()V", "", "from", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "a", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "FROM", "Ljava/lang/String;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ MyVisitorsFrag m59222b(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.m59223a(str);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MyVisitorsFrag m59223a(@Nullable String from) {
            MyVisitorsFrag myVisitorsFrag = new MyVisitorsFrag();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(from)) {
                bundle.putString("from", from);
            }
            myVisitorsFrag.setArguments(bundle);
            return myVisitorsFrag;
        }

        public Companion() {
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public ha20 mo30639M4() {
        return new ha20(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ka20 mo30640N4() {
        return new ka20(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_my_visitor_isee";
    }
}
