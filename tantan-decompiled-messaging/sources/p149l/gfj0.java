package p149l;

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
public class gfj0 extends hfj0 {
    /* JADX INFO: renamed from: i */
    public static int m125889i(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo106577a(Context context, ayi.C15760c c15760c, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (ayi.C15761d c15761d : c15760c.m99554a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c15761d.m99556b()).setWeight(c15761d.m99559e()).setSlant(c15761d.m99560f() ? 1 : 0).setTtcIndex(c15761d.m99557c()).setFontVariationSettings(c15761d.m99558d()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m125890h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo106578b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull byi.C16014b[] c16014bArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (byi.C16014b c16014b : c16014bArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c16014b.m104467d(), "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c16014b.m104468e()).setSlant(c16014b.m104469f() ? 1 : 0).setTtcIndex(c16014b.m104466c()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m125890h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public Typeface mo116071d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Font m125890h(@NonNull FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM125889i = m125889i(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM125889i2 = m125889i(fontStyle, font2.getStyle());
            if (iM125889i2 < iM125889i) {
                font = font2;
                iM125889i = iM125889i2;
            }
        }
        return font;
    }
}
