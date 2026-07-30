package com.p000p1.mobile.putong.core.newui.nearby;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.gr9;
import l.x4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "c", "Ljava/lang/String;", "getFRAG_TAG", "()Ljava/lang/String;", "FRAG_TAG", "Lcom/p1/mobile/putong/app/PutongFrag;", "d", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NearbyAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String FRAG_TAG = "nearby_frag_root";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PutongFrag frag;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.nearby.NearbyAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "from", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m6859a(@NotNull Context context, @NotNull String from) {
            context.getClass();
            from.getClass();
            Intent intent = new Intent(context, (Class<?>) NearbyAct.class);
            intent.putExtra("from", from);
            return intent;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: V1 */
    public static final Intent m6858V1(@NotNull Context context, @NotNull String str) {
        return INSTANCE.m6859a(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.t);
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        PutongFrag putongFragI0 = supportFragmentManager.i0(this.FRAG_TAG);
        if (gr9.Companion.c()) {
            if (putongFragI0 instanceof SupremePartnerTabFrag) {
                this.frag = putongFragI0;
                return frameLayout;
            }
            SupremePartnerTabFrag supremePartnerTabFrag = new SupremePartnerTabFrag();
            Bundle bundle = new Bundle();
            bundle.putString("from", "from_nearby_act");
            supremePartnerTabFrag.setArguments(bundle);
            getIntent().putExtra("from", "from_nearby_act");
            k kVarM = supportFragmentManager.m();
            kVarM.getClass();
            kVarM.c(x4c0.t, supremePartnerTabFrag, this.FRAG_TAG);
            kVarM.j();
            this.frag = supremePartnerTabFrag;
            return frameLayout;
        }
        if (putongFragI0 instanceof NearbyFrag) {
            this.frag = putongFragI0;
            return frameLayout;
        }
        NearbyFrag nearbyFragM6879b = NearbyFrag.Companion.m6879b(NearbyFrag.INSTANCE, null, 1, null);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("hideNavigation", false);
        bundle2.putString("from", getIntent().getStringExtra("from"));
        nearbyFragM6879b.setArguments(bundle2);
        getIntent().putExtra("hideNavigation", false);
        k kVarM2 = supportFragmentManager.m();
        kVarM2.getClass();
        kVarM2.c(x4c0.t, nearbyFragM6879b, this.FRAG_TAG);
        kVarM2.j();
        this.frag = nearbyFragM6879b;
        return frameLayout;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        item.getClass();
        if (item.getItemId() != 16908332) {
            return super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }
}
