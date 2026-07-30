package p149l;

import android.app.Application;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.p046p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes11.dex */
public class o480 {

    /* JADX INFO: renamed from: a */
    public PlacesClient f141756a;

    public o480() {
        m162555a();
    }

    /* JADX INFO: renamed from: a */
    public final void m162555a() {
        Application application = App.f15369e;
        Places.initialize(application, bo0.m102890c(application, "com.google.android.geo.API_KEY"));
        this.f141756a = Places.createClient(App.f15369e);
    }
}
