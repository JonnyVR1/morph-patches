package p153l;

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
public final class vzb {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Intent f186459a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Bundle f186460b;

    public vzb(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.f186459a = intent;
        this.f186460b = bundle;
    }

    /* JADX INFO: renamed from: a */
    public void m204045a(@NonNull Context context, @NonNull Uri uri) {
        this.f186459a.setData(uri);
        j26.m143201n(context, this.f186459a, this.f186460b);
    }

    /* JADX INFO: renamed from: l.vzb$a */
    public static final class C20961a {

        /* JADX INFO: renamed from: c */
        @Nullable
        public ArrayList<Bundle> f186463c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Bundle f186464d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public ArrayList<Bundle> f186465e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public SparseArray<Bundle> f186466f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Bundle f186467g;

        /* JADX INFO: renamed from: a */
        public final Intent f186461a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        public final pzb.C19466a f186462b = new pzb.C19466a();

        /* JADX INFO: renamed from: h */
        public int f186468h = 0;

        /* JADX INFO: renamed from: i */
        public boolean f186469i = true;

        public C20961a(@Nullable yzb yzbVar) {
            if (yzbVar != null) {
                m204047b(yzbVar);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public vzb m204046a() {
            if (!this.f186461a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m204048c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f186463c;
            if (arrayList != null) {
                this.f186461a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f186465e;
            if (arrayList2 != null) {
                this.f186461a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f186461a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f186469i);
            this.f186461a.putExtras(this.f186462b.m174359a().m174358a());
            Bundle bundle = this.f186467g;
            if (bundle != null) {
                this.f186461a.putExtras(bundle);
            }
            if (this.f186466f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f186466f);
                this.f186461a.putExtras(bundle2);
            }
            this.f186461a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f186468h);
            return new vzb(this.f186461a, this.f186464d);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C20961a m204047b(@NonNull yzb yzbVar) {
            this.f186461a.setPackage(yzbVar.m218015d().getPackageName());
            m204048c(yzbVar.m218014c(), yzbVar.m218016e());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final void m204048c(@Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            wi3.m206547b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f186461a.putExtras(bundle);
        }

        public C20961a() {
        }
    }
}
