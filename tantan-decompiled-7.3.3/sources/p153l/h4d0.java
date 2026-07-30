package p153l;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class h4d0<Data> implements re00<Integer, Data> {

    /* JADX INFO: renamed from: a */
    private final re00<Uri, Data> f107790a;

    /* JADX INFO: renamed from: b */
    private final Resources f107791b;

    /* JADX INFO: renamed from: l.h4d0$a */
    public static final class C17389a implements se00<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final Resources f107792a;

        public C17389a(Resources resources) {
            this.f107792a = resources;
        }

        @Override // p153l.se00
        /* JADX INFO: renamed from: b */
        public re00<Integer, AssetFileDescriptor> mo101570b(qs10 qs10Var) {
            return new h4d0(this.f107792a, qs10Var.m177716d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.h4d0$b */
    public static class C17390b implements se00<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        private final Resources f107793a;

        public C17390b(Resources resources) {
            this.f107793a = resources;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Integer, ParcelFileDescriptor> mo101570b(qs10 qs10Var) {
            return new h4d0(this.f107793a, qs10Var.m177716d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: l.h4d0$c */
    public static class C17391c implements se00<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        private final Resources f107794a;

        public C17391c(Resources resources) {
            this.f107794a = resources;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Integer, InputStream> mo101570b(qs10 qs10Var) {
            return new h4d0(this.f107794a, qs10Var.m177716d(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: l.h4d0$d */
    public static class C17392d implements se00<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        private final Resources f107795a;

        public C17392d(Resources resources) {
            this.f107795a = resources;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Integer, Uri> mo101570b(qs10 qs10Var) {
            return new h4d0(this.f107795a, yxj0.m217719c());
        }
    }

    public h4d0(Resources resources, re00<Uri, Data> re00Var) {
        this.f107791b = resources;
        this.f107790a = re00Var;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    private Uri m133561d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f107791b.getResourcePackageName(num.intValue()) + '/' + this.f107791b.getResourceTypeName(num.intValue()) + '/' + this.f107791b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            return null;
        }
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull Integer num, int i, int i2, @NonNull u560 u560Var) {
        Uri uriM133561d = m133561d(num);
        if (uriM133561d == null) {
            return null;
        }
        return this.f107790a.mo101565a(uriM133561d, i, i2, u560Var);
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Integer num) {
        return true;
    }
}
