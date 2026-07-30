package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class vkq0 extends c610<MonitorEvent> {
    @Override // p153l.f0m
    /* JADX INFO: renamed from: a */
    public String mo82290a() {
        return "native";
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: b */
    public void mo108089b() {
        je20.m144514a();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo82291c() {
        return super.mo82291c() + "/crash/" + mo82290a();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: d */
    public x2f mo82292d() {
        return ke20.m149293d();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: e */
    public k5f mo82293e() {
        return new le20();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: g */
    public void mo82295g(Context context, x3f x3fVar) {
        super.mo82295g(context, x3fVar);
        String strMo82291c = mo82291c();
        File file = new File(strMo82291c);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f79924c = je20.m144516c(context, this, strMo82291c);
    }

    @Override // p153l.f0m
    public String getEventType() {
        return "crash";
    }
}
