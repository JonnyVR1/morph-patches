package p149l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hyb {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Intent f110043a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Bundle f110044b;

    public hyb(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.f110043a = intent;
        this.f110044b = bundle;
    }

    /* JADX INFO: renamed from: a */
    public void m133504a(@NonNull Context context, @NonNull Uri uri) {
        this.f110043a.setData(uri);
        e16.m114386n(context, this.f110043a, this.f110044b);
    }

    /* JADX INFO: renamed from: l.hyb$a */
    public static final class C17431a {

        /* JADX INFO: renamed from: c */
        @Nullable
        public ArrayList<Bundle> f110047c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Bundle f110048d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public ArrayList<Bundle> f110049e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public SparseArray<Bundle> f110050f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Bundle f110051g;

        /* JADX INFO: renamed from: a */
        public final Intent f110045a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        public final byb.C16010a f110046b = new byb.C16010a();

        /* JADX INFO: renamed from: h */
        public int f110052h = 0;

        /* JADX INFO: renamed from: i */
        public boolean f110053i = true;

        public C17431a(@Nullable kyb kybVar) {
            if (kybVar != null) {
                m133506b(kybVar);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public hyb m133505a() {
            if (!this.f110045a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m133507c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f110047c;
            if (arrayList != null) {
                this.f110045a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f110049e;
            if (arrayList2 != null) {
                this.f110045a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f110045a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f110053i);
            this.f110045a.putExtras(this.f110046b.m104436a().m104435a());
            Bundle bundle = this.f110051g;
            if (bundle != null) {
                this.f110045a.putExtras(bundle);
            }
            if (this.f110050f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f110050f);
                this.f110045a.putExtras(bundle2);
            }
            this.f110045a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f110052h);
            return new hyb(this.f110045a, this.f110048d);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C17431a m133506b(@NonNull kyb kybVar) {
            this.f110045a.setPackage(kybVar.m147844d().getPackageName());
            m133507c(kybVar.m147843c(), kybVar.m147845e());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final void m133507c(@Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            ii3.m136330b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f110045a.putExtras(bundle);
        }

        public C17431a() {
        }
    }
}
