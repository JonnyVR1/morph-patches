package com.momo.xeengine.svgaplayer;

import android.graphics.Path;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.StringTokenizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.b2s;
import p149l.j6f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m87232d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAPath;", "", "originValue", "", "(Ljava/lang/String;)V", "cachedPath", "Landroid/graphics/Path;", "replacedValue", "buildPath", "", "toPath", "operate", "finalPath", FirebaseAnalytics.Param.METHOD, "args", "Ljava/util/StringTokenizer;", "gift_player_release"}, m87233k = 1, m87234mv = {1, 1, 15})
public final class SVGAPath {
    private Path cachedPath;
    private final String replacedValue;

    public SVGAPath(@NotNull String str) {
        str.getClass();
        if (StringsKt.m93412P(str, Constants.SEPARATOR_COMMA, false, 2, null)) {
            str = C15386d.m93479F(str, Constants.SEPARATOR_COMMA, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, false, 4, null);
        }
        this.replacedValue = str;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    private final void operate(Path finalPath, String method, StringTokenizer args) {
        SVGAPoint sVGAPoint;
        float f;
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (args.hasMoreTokens()) {
            try {
                String strNextToken = args.nextToken();
                strNextToken.getClass();
                if (strNextToken.length() != 0) {
                    if (i == 0) {
                        f2 = Float.parseFloat(strNextToken);
                    }
                    if (i == 1) {
                        f3 = Float.parseFloat(strNextToken);
                    }
                    if (i == 2) {
                        f4 = Float.parseFloat(strNextToken);
                    }
                    if (i == 3) {
                        f5 = Float.parseFloat(strNextToken);
                    }
                    if (i == 4) {
                        f6 = Float.parseFloat(strNextToken);
                    }
                    if (i == 5) {
                        f7 = Float.parseFloat(strNextToken);
                    }
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        float f11 = f5;
        float f12 = f6;
        SVGAPoint sVGAPoint2 = new SVGAPoint(0.0f, 0.0f, 0.0f);
        if (!Intrinsics.m87488d(method, "M")) {
            if (Intrinsics.m87488d(method, "m")) {
                finalPath.rMoveTo(f8, f9);
                sVGAPoint = new SVGAPoint(sVGAPoint2.getX() + f8, sVGAPoint2.getY() + f9, 0.0f);
            }
            if (Intrinsics.m87488d(method, "L")) {
                finalPath.lineTo(f8, f9);
            } else if (Intrinsics.m87488d(method, BLiveStormDanmakuGiftResourceType.f44444l)) {
                finalPath.rLineTo(f8, f9);
            }
            if (Intrinsics.m87488d(method, b2s.C_ZONE)) {
                finalPath.cubicTo(f8, f9, f10, f11, f12, f7);
            } else {
                f = f7;
                if (Intrinsics.m87488d(method, "c")) {
                    finalPath.rCubicTo(f8, f9, f10, f11, f12, f);
                }
            }
            if (Intrinsics.m87488d(method, "Q")) {
                finalPath.quadTo(f8, f9, f10, f11);
            } else if (Intrinsics.m87488d(method, "q")) {
                finalPath.rQuadTo(f8, f9, f10, f11);
            }
            if (Intrinsics.m87488d(method, "H")) {
                finalPath.lineTo(f8, sVGAPoint.getY());
            } else if (Intrinsics.m87488d(method, "h")) {
                finalPath.rLineTo(f8, 0.0f);
            }
            if (Intrinsics.m87488d(method, j6f.GPS_MEASUREMENT_INTERRUPTED)) {
                finalPath.lineTo(sVGAPoint.getX(), f8);
            } else if (Intrinsics.m87488d(method, ResourceDirection.f38808v)) {
                finalPath.rLineTo(0.0f, f8);
            }
            if (Intrinsics.m87488d(method, "Z")) {
                finalPath.close();
            } else if (Intrinsics.m87488d(method, BaseSei.f13932Z)) {
                finalPath.close();
            }
        }
        finalPath.moveTo(f8, f9);
        sVGAPoint2 = new SVGAPoint(f8, f9, 0.0f);
        sVGAPoint = sVGAPoint2;
        if (Intrinsics.m87488d(method, "L")) {
            finalPath.lineTo(f8, f9);
        } else if (Intrinsics.m87488d(method, BLiveStormDanmakuGiftResourceType.f44444l)) {
            finalPath.rLineTo(f8, f9);
        }
        if (Intrinsics.m87488d(method, b2s.C_ZONE)) {
            finalPath.cubicTo(f8, f9, f10, f11, f12, f7);
        } else {
            f = f7;
            if (Intrinsics.m87488d(method, "c")) {
                finalPath.rCubicTo(f8, f9, f10, f11, f12, f);
            }
        }
        if (Intrinsics.m87488d(method, "Q")) {
            finalPath.quadTo(f8, f9, f10, f11);
        } else if (Intrinsics.m87488d(method, "q")) {
            finalPath.rQuadTo(f8, f9, f10, f11);
        }
        if (Intrinsics.m87488d(method, "H")) {
            finalPath.lineTo(f8, sVGAPoint.getY());
        } else if (Intrinsics.m87488d(method, "h")) {
            finalPath.rLineTo(f8, 0.0f);
        }
        if (Intrinsics.m87488d(method, j6f.GPS_MEASUREMENT_INTERRUPTED)) {
            finalPath.lineTo(sVGAPoint.getX(), f8);
        } else if (Intrinsics.m87488d(method, ResourceDirection.f38808v)) {
            finalPath.rLineTo(0.0f, f8);
        }
        if (Intrinsics.m87488d(method, "Z")) {
            finalPath.close();
        } else if (Intrinsics.m87488d(method, BaseSei.f13932Z)) {
            finalPath.close();
        }
    }

    public final void buildPath(@NotNull Path toPath) {
        toPath.getClass();
        Path path = this.cachedPath;
        if (path != null) {
            toPath.set(path);
            return;
        }
        Path path2 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.replacedValue, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            strNextToken.getClass();
            if (strNextToken.length() != 0) {
                if (SVGAPathKt.VALID_METHODS.contains(strNextToken)) {
                    if (Intrinsics.m87488d(strNextToken, "Z") || Intrinsics.m87488d(strNextToken, BaseSei.f13932Z)) {
                        operate(path2, strNextToken, new StringTokenizer("", ""));
                    }
                    str = strNextToken;
                } else {
                    operate(path2, str, new StringTokenizer(strNextToken, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
                }
            }
        }
        this.cachedPath = path2;
        toPath.set(path2);
    }
}
