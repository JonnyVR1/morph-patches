package p009l;

import android.app.Application;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.p1.mobile.android.app.App;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o480 {

    /* JADX INFO: renamed from: a */
    public PlacesClient f17828a;

    public o480() {
        m19611a();
    }

    /* JADX INFO: renamed from: a */
    public final void m19611a() {
        Application application = App.e;
        Places.initialize(application, bo0.m12181c(application, "com.google.android.geo.API_KEY"));
        this.f17828a = Places.createClient(App.e);
    }
}
