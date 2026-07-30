package p153l;

import android.app.Application;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.p051p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes10.dex */
public class uc80 {

    /* JADX INFO: renamed from: a */
    public PlacesClient f178415a;

    public uc80() {
        m195385a();
    }

    /* JADX INFO: renamed from: a */
    public final void m195385a() {
        Application application = App.f16088e;
        Places.initialize(application, xn0.m212075c(application, "com.google.android.geo.API_KEY"));
        this.f178415a = Places.createClient(App.f16088e);
    }
}
