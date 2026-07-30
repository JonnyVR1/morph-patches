package p149l;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ewc0<Data> implements i600<Integer, Data> {

    /* JADX INFO: renamed from: a */
    private final i600<Uri, Data> f93486a;

    /* JADX INFO: renamed from: b */
    private final Resources f93487b;

    /* JADX INFO: renamed from: l.ewc0$a */
    public static final class C16699a implements j600<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final Resources f93488a;

        public C16699a(Resources resources) {
            this.f93488a = resources;
        }

        @Override // p149l.j600
        /* JADX INFO: renamed from: b */
        public i600<Integer, AssetFileDescriptor> mo103357b(gk10 gk10Var) {
            return new ewc0(this.f93488a, gk10Var.m126584d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.ewc0$b */
    public static class C16700b implements j600<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final Resources f93489a;

        public C16700b(Resources resources) {
            this.f93489a = resources;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Integer, ParcelFileDescriptor> mo103357b(gk10 gk10Var) {
            return new ewc0(this.f93489a, gk10Var.m126584d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.ewc0$c */
    public static class C16701c implements j600<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        private final Resources f93490a;

        public C16701c(Resources resources) {
            this.f93490a = resources;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Integer, InputStream> mo103357b(gk10 gk10Var) {
            return new ewc0(this.f93490a, gk10Var.m126584d(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: l.ewc0$d */
    public static class C16702d implements j600<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        private final Resources f93491a;

        public C16702d(Resources resources) {
            this.f93491a = resources;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Integer, Uri> mo103357b(gk10 gk10Var) {
            return new ewc0(this.f93491a, voj0.m199166c());
        }
    }

    public ewc0(Resources resources, i600<Uri, Data> i600Var) {
        this.f93487b = resources;
        this.f93486a = i600Var;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    private Uri m118464d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f93487b.getResourcePackageName(num.intValue()) + '/' + this.f93487b.getResourceTypeName(num.intValue()) + '/' + this.f93487b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            return null;
        }
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull Integer num, int i, int i2, @NonNull px50 px50Var) {
        Uri uriM118464d = m118464d(num);
        if (uriM118464d == null) {
            return null;
        }
        return this.f93486a.mo103352a(uriM118464d, i, i2, px50Var);
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Integer num) {
        return true;
    }
}
