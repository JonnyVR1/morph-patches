package com.p046p1.mobile.putong.core.newui.nearby;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gr9;
import p149l.x4c0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/MenuItem;", Item.TYPE, "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "c", "Ljava/lang/String;", "getFRAG_TAG", "()Ljava/lang/String;", "FRAG_TAG", "Lcom/p1/mobile/putong/app/PutongFrag;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "from", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m42693a(@NotNull Context context, @NotNull String from) {
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
    public static final Intent m42692V1(@NotNull Context context, @NotNull String str) {
        return INSTANCE.m42693a(context, str);
    }

    @Override // com.p046p1.mobile.android.app.Act
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.f191009t);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0(this.FRAG_TAG);
        if (gr9.INSTANCE.m127687c()) {
            if (fragmentM2557i0 instanceof SupremePartnerTabFrag) {
                this.frag = (PutongFrag) fragmentM2557i0;
                return frameLayout;
            }
            SupremePartnerTabFrag supremePartnerTabFrag = new SupremePartnerTabFrag();
            Bundle bundle = new Bundle();
            bundle.putString("from", "from_nearby_act");
            supremePartnerTabFrag.setArguments(bundle);
            getIntent().putExtra("from", "from_nearby_act");
            AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
            abstractC0427kM2567m.getClass();
            abstractC0427kM2567m.m2804c(x4c0.f191009t, supremePartnerTabFrag, this.FRAG_TAG);
            abstractC0427kM2567m.mo2708j();
            this.frag = supremePartnerTabFrag;
            return frameLayout;
        }
        if (fragmentM2557i0 instanceof NearbyFrag) {
            this.frag = (PutongFrag) fragmentM2557i0;
            return frameLayout;
        }
        NearbyFrag nearbyFragM42708b = NearbyFrag.Companion.m42708b(NearbyFrag.INSTANCE, null, 1, null);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("hideNavigation", false);
        bundle2.putString("from", getIntent().getStringExtra("from"));
        nearbyFragM42708b.setArguments(bundle2);
        getIntent().putExtra("hideNavigation", false);
        AbstractC0427k abstractC0427kM2567m2 = supportFragmentManager.m2567m();
        abstractC0427kM2567m2.getClass();
        abstractC0427kM2567m2.m2804c(x4c0.f191009t, nearbyFragM42708b, this.FRAG_TAG);
        abstractC0427kM2567m2.mo2708j();
        this.frag = nearbyFragM42708b;
        return frameLayout;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        item.getClass();
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }
}
