package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class koj0 extends loj0 {
    /* JADX INFO: renamed from: i */
    public static int m150639i(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo131115a(Context context, w0j.C20974c c20974c, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (w0j.C20975d c20975d : c20974c.m204190a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c20975d.m204192b()).setWeight(c20975d.m204195e()).setSlant(c20975d.m204196f() ? 1 : 0).setTtcIndex(c20975d.m204193c()).setFontVariationSettings(c20975d.m204194d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m150640h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo131116b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull x0j.C21223b[] c21223bArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (x0j.C21223b c21223b : c21223bArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c21223b.m208864d(), "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c21223b.m208865e()).setSlant(c21223b.m208866f() ? 1 : 0).setTtcIndex(c21223b.m208863c()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m150640h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public Typeface mo141319d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Font m150640h(@NonNull FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM150639i = m150639i(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM150639i2 = m150639i(fontStyle, font2.getStyle());
            if (iM150639i2 < iM150639i) {
                font = font2;
                iM150639i = iM150639i2;
            }
        }
        return font;
    }
}
