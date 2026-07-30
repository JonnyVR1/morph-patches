package com.idv.identity.service;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.idv.identity.base.algorithm.IDFrame;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p153l.gfm;
import p153l.o6r0;
import p153l.rxk;
import p153l.srq0;

/* JADX INFO: renamed from: com.idv.identity.service.b */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3876b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IDFrame f13566a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceService f13567b;

    public RunnableC3876b(IdentityFaceService identityFaceService, IDFrame iDFrame) {
        this.f13567b = identityFaceService;
        this.f13566a = iDFrame;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02ea  */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i;
        Bitmap bitmapM187638b;
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        String lowerCase;
        int i2;
        String strValueOf;
        MessageDigest messageDigest3;
        String strValueOf2;
        MessageDigest messageDigest4;
        String lowerCase2;
        int i3;
        MessageDigest messageDigest5;
        MessageDigest messageDigest6;
        String lowerCase3;
        int i4;
        MessageDigest messageDigest7;
        IDFrame iDFrame = this.f13566a;
        if (iDFrame != null) {
            switch (iDFrame.frameMode) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                case 6:
                    i = 4;
                    break;
                case 5:
                    i = 6;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i < 0 || (bitmapM187638b = srq0.m187638b(iDFrame.data, iDFrame.width, iDFrame.height, i)) == null) {
                bitmap = null;
            } else {
                String strValueOf3 = String.valueOf(System.identityHashCode(bitmapM187638b));
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                    try {
                        messageDigest.update(strValueOf3.getBytes());
                    } catch (NoSuchAlgorithmException unused) {
                    }
                } catch (NoSuchAlgorithmException unused2) {
                    messageDigest = null;
                }
                if (messageDigest != null) {
                    for (byte b : messageDigest.digest()) {
                        String.format("%02X", Byte.valueOf(b));
                    }
                }
                o6r0.m166281a("IdentityImageAndroid idFrame.rotation" + iDFrame.rotation);
                int i5 = iDFrame.rotation;
                String strValueOf4 = String.valueOf(System.identityHashCode(bitmapM187638b));
                StringBuilder sb = new StringBuilder();
                try {
                    try {
                        try {
                            try {
                                try {
                                    messageDigest2 = MessageDigest.getInstance("MD5");
                                    try {
                                        messageDigest2.update(strValueOf4.getBytes());
                                        while (true) {
                                            if (i2 >= rxk.f165346b.size()) {
                                                rxk.f165348d.add(1);
                                            } else if (!rxk.f165346b.get(i2).equals(lowerCase)) {
                                                i2++;
                                            }
                                        }
                                        while (true) {
                                            if (i3 >= rxk.f165346b.size()) {
                                                rxk.f165348d.add(1);
                                            } else if (!rxk.f165346b.get(i3).equals(lowerCase2)) {
                                                i3++;
                                            }
                                        }
                                    } catch (NoSuchAlgorithmException unused3) {
                                    }
                                } catch (NoSuchAlgorithmException unused4) {
                                    messageDigest2 = null;
                                }
                                messageDigest3.update(strValueOf.getBytes());
                            } catch (NoSuchAlgorithmException unused5) {
                            }
                            messageDigest3 = MessageDigest.getInstance("MD5");
                        } catch (NoSuchAlgorithmException unused6) {
                            messageDigest3 = null;
                        }
                        messageDigest4.update(strValueOf2.getBytes());
                    } catch (NoSuchAlgorithmException unused7) {
                    }
                    messageDigest4 = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused8) {
                    messageDigest4 = null;
                }
                if (messageDigest2 != null) {
                    for (byte b2 : messageDigest2.digest()) {
                        sb.append(String.format("%02X", Byte.valueOf(b2)));
                    }
                }
                lowerCase = sb.toString().toLowerCase();
                i2 = 0;
                int width = bitmapM187638b.getWidth();
                int height = bitmapM187638b.getHeight();
                Matrix matrix = new Matrix();
                matrix.setRotate(i5);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM187638b, 0, 0, width, height, matrix, false);
                strValueOf = String.valueOf(System.identityHashCode(bitmapCreateBitmap));
                StringBuilder sb2 = new StringBuilder();
                if (messageDigest3 != null) {
                    for (byte b3 : messageDigest3.digest()) {
                        sb2.append(String.format("%02X", Byte.valueOf(b3)));
                    }
                }
                rxk.f165346b.add(sb2.toString().toLowerCase());
                if (!bitmapCreateBitmap.equals(bitmapM187638b)) {
                    bitmapM187638b.recycle();
                }
                strValueOf2 = String.valueOf(System.identityHashCode(bitmapCreateBitmap));
                StringBuilder sb3 = new StringBuilder();
                if (messageDigest4 != null) {
                    for (byte b4 : messageDigest4.digest()) {
                        sb3.append(String.format("%02X", Byte.valueOf(b4)));
                    }
                }
                lowerCase2 = sb3.toString().toLowerCase();
                i3 = 0;
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                bitmapCreateBitmap.recycle();
                String strValueOf5 = String.valueOf(System.identityHashCode(bitmapCreateBitmap2));
                StringBuilder sb4 = new StringBuilder();
                try {
                    messageDigest5 = MessageDigest.getInstance("MD5");
                    try {
                        messageDigest5.update(strValueOf5.getBytes());
                    } catch (NoSuchAlgorithmException unused9) {
                    }
                } catch (NoSuchAlgorithmException unused10) {
                    messageDigest5 = null;
                }
                if (messageDigest5 != null) {
                    for (byte b5 : messageDigest5.digest()) {
                        sb4.append(String.format("%02X", Byte.valueOf(b5)));
                    }
                }
                rxk.f165346b.add(sb4.toString().toLowerCase());
                if (bitmapCreateBitmap2 != null) {
                    int width2 = bitmapCreateBitmap2.getWidth() <= 480 ? bitmapCreateBitmap2.getWidth() : 480;
                    if (width2 != iDFrame.width) {
                        String strValueOf6 = String.valueOf(System.identityHashCode(bitmapCreateBitmap2));
                        StringBuilder sb5 = new StringBuilder();
                        try {
                            messageDigest6 = MessageDigest.getInstance("MD5");
                            try {
                                messageDigest6.update(strValueOf6.getBytes());
                                while (true) {
                                    if (i4 >= rxk.f165346b.size()) {
                                        rxk.f165348d.add(1);
                                    } else if (!rxk.f165346b.get(i4).equals(lowerCase3)) {
                                        i4++;
                                    }
                                }
                            } catch (NoSuchAlgorithmException unused11) {
                            }
                        } catch (NoSuchAlgorithmException unused12) {
                            messageDigest6 = null;
                        }
                        if (messageDigest6 != null) {
                            for (byte b6 : messageDigest6.digest()) {
                                sb5.append(String.format("%02X", Byte.valueOf(b6)));
                            }
                        }
                        lowerCase3 = sb5.toString().toLowerCase();
                        i4 = 0;
                        int width3 = bitmapCreateBitmap2.getWidth();
                        int height2 = bitmapCreateBitmap2.getHeight();
                        float f = width2 / width3;
                        Matrix matrix3 = new Matrix();
                        matrix3.postScale(f, f);
                        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap2, 0, 0, width3, height2, matrix3, true);
                        if (bitmapCreateBitmap3 != bitmapCreateBitmap2) {
                            bitmapCreateBitmap2.recycle();
                        }
                        String strValueOf7 = String.valueOf(System.identityHashCode(bitmapCreateBitmap3));
                        StringBuilder sb6 = new StringBuilder();
                        try {
                            messageDigest7 = MessageDigest.getInstance("MD5");
                            try {
                                messageDigest7.update(strValueOf7.getBytes());
                            } catch (NoSuchAlgorithmException unused13) {
                            }
                        } catch (NoSuchAlgorithmException unused14) {
                            messageDigest7 = null;
                        }
                        if (messageDigest7 != null) {
                            for (byte b7 : messageDigest7.digest()) {
                                sb6.append(String.format("%02X", Byte.valueOf(b7)));
                            }
                        }
                        rxk.f165346b.add(sb6.toString().toLowerCase());
                        bitmap = bitmapCreateBitmap3;
                    } else {
                        bitmap = bitmapCreateBitmap2;
                    }
                } else {
                    bitmap = null;
                }
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            o6r0.m166281a("IdentityFaceService highQualityImage  is  null");
            return;
        }
        for (gfm gfmVar : this.f13567b.identityFaceCallbacks) {
            int i6 = this.f13566a.frameType;
            if (i6 == 2) {
                gfmVar.mo130088h(bitmap);
            } else if (i6 == 3) {
                gfmVar.mo130092l(bitmap);
            } else if (i6 == 1) {
                gfmVar.mo130082b(bitmap);
            } else if (i6 == 4) {
                gfmVar.mo130084d(bitmap);
            } else if (i6 == 5) {
                gfmVar.mo130083c(bitmap);
            } else if (i6 == 6) {
                gfmVar.mo130089i(bitmap);
            } else if (i6 == 7) {
                gfmVar.mo130081a(bitmap);
            }
        }
    }
}
