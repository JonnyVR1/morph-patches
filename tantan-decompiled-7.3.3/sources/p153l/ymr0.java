package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class ymr0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final String[] f200710a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX WARN: Code duplicated, block: B:135:0x0261 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:9:0x0030, B:13:0x003a, B:18:0x0046, B:19:0x0052, B:22:0x005e, B:25:0x006b, B:28:0x007a, B:31:0x0087, B:34:0x0095, B:36:0x009f, B:44:0x00b8, B:45:0x00c9, B:46:0x00dc, B:49:0x00e8, B:52:0x00f5, B:55:0x0102, B:58:0x010f, B:61:0x011c, B:64:0x0129, B:67:0x0136, B:70:0x0143, B:73:0x0150, B:76:0x015d, B:80:0x016e, B:82:0x0174, B:84:0x0188, B:85:0x018f, B:87:0x0196, B:92:0x01a1, B:97:0x01ad, B:135:0x0261, B:98:0x01c2, B:100:0x01c9, B:102:0x01d3, B:103:0x01e7, B:116:0x0213, B:119:0x0220, B:122:0x022c, B:125:0x0238, B:128:0x0244, B:131:0x0250, B:134:0x025a, B:136:0x0275, B:137:0x027c), top: B:142:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x0261, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static zzbx m216733a(bgw0 bgw0Var) {
        String str;
        int iM104277s = bgw0Var.m104277s() + bgw0Var.m104280v();
        int iM104280v = bgw0Var.m104280v();
        int i = (iM104280v >> 24) & 255;
        zzbx zzbxVarM216737e = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iM104280v & 16777215;
                if (i2 == 6516084) {
                    int iM104280v2 = bgw0Var.m104280v();
                    if (bgw0Var.m104280v() == 1684108385) {
                        bgw0Var.m104270l(8);
                        String strM104258O = bgw0Var.m104258O(iM104280v2 - 16);
                        zzbxVarM216737e = new zzagk(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, strM104258O, strM104258O);
                    } else {
                        y4w0.m214278f("MetadataUtil", "Failed to parse comment attribute: ".concat(zlr0.m220301b(iM104280v)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzbxVarM216737e = m216737e(iM104280v, "TIT2", bgw0Var);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzbxVarM216737e = m216737e(iM104280v, "TCOM", bgw0Var);
                } else if (i2 == 6578553) {
                    zzbxVarM216737e = m216737e(iM104280v, "TDRC", bgw0Var);
                } else if (i2 == 4280916) {
                    zzbxVarM216737e = m216737e(iM104280v, "TPE1", bgw0Var);
                } else if (i2 == 7630703) {
                    zzbxVarM216737e = m216737e(iM104280v, "TSSE", bgw0Var);
                } else if (i2 == 6384738) {
                    zzbxVarM216737e = m216737e(iM104280v, "TALB", bgw0Var);
                } else if (i2 == 7108978) {
                    zzbxVarM216737e = m216737e(iM104280v, "USLT", bgw0Var);
                } else if (i2 == 6776174) {
                    zzbxVarM216737e = m216737e(iM104280v, "TCON", bgw0Var);
                } else if (i2 == 6779504) {
                    zzbxVarM216737e = m216737e(iM104280v, "TIT1", bgw0Var);
                } else {
                    y4w0.m214274b("MetadataUtil", "Skipped unknown metadata entry: " + zlr0.m220301b(iM104280v));
                }
            } else if (iM104280v == 1735291493) {
                int iM216734b = m216734b(bgw0Var);
                String str2 = (iM216734b <= 0 || iM216734b > 192) ? null : f200710a[iM216734b - 1];
                if (str2 != null) {
                    zzbxVarM216737e = new zzagz("TCON", null, zzgaa.zzm(str2));
                } else {
                    y4w0.m214278f("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iM104280v == 1684632427) {
                zzbxVarM216737e = m216736d(1684632427, "TPOS", bgw0Var);
            } else if (iM104280v == 1953655662) {
                zzbxVarM216737e = m216736d(1953655662, "TRCK", bgw0Var);
            } else if (iM104280v == 1953329263) {
                zzbxVarM216737e = m216735c(1953329263, "TBPM", bgw0Var, true, false);
            } else if (iM104280v == 1668311404) {
                zzbxVarM216737e = m216735c(1668311404, "TCMP", bgw0Var, true, true);
            } else if (iM104280v == 1668249202) {
                int iM104280v3 = bgw0Var.m104280v();
                if (bgw0Var.m104280v() == 1684108385) {
                    int iM104280v4 = bgw0Var.m104280v() & 16777215;
                    if (iM104280v4 == 13) {
                        str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                    } else if (iM104280v4 == 14) {
                        str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
                        iM104280v4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        y4w0.m214278f("MetadataUtil", "Unrecognized cover art flags: " + iM104280v4);
                    } else {
                        bgw0Var.m104270l(4);
                        int i3 = iM104280v3 - 16;
                        byte[] bArr = new byte[i3];
                        bgw0Var.m104265g(bArr, 0, i3);
                        zzbxVarM216737e = new zzagc(str, null, 3, bArr);
                    }
                } else {
                    y4w0.m214278f("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iM104280v == 1631670868) {
                zzbxVarM216737e = m216737e(1631670868, "TPE2", bgw0Var);
            } else if (iM104280v == 1936682605) {
                zzbxVarM216737e = m216737e(1936682605, "TSOT", bgw0Var);
            } else if (iM104280v == 1936679276) {
                zzbxVarM216737e = m216737e(1936679276, "TSO2", bgw0Var);
            } else if (iM104280v == 1936679282) {
                zzbxVarM216737e = m216737e(1936679282, "TSOA", bgw0Var);
            } else if (iM104280v == 1936679265) {
                zzbxVarM216737e = m216737e(1936679265, "TSOP", bgw0Var);
            } else if (iM104280v == 1936679791) {
                zzbxVarM216737e = m216737e(1936679791, "TSOC", bgw0Var);
            } else if (iM104280v == 1920233063) {
                zzbxVarM216737e = m216735c(1920233063, "ITUNESADVISORY", bgw0Var, false, false);
            } else if (iM104280v == 1885823344) {
                zzbxVarM216737e = m216735c(1885823344, "ITUNESGAPLESS", bgw0Var, false, true);
            } else if (iM104280v == 1936683886) {
                zzbxVarM216737e = m216737e(1936683886, "TVSHOWSORT", bgw0Var);
            } else if (iM104280v == 1953919848) {
                zzbxVarM216737e = m216737e(1953919848, "TVSHOW", bgw0Var);
            } else if (iM104280v == 757935405) {
                int i4 = -1;
                int i5 = -1;
                String strM104258O2 = null;
                String strM104258O3 = null;
                while (bgw0Var.m104277s() < iM104277s) {
                    int iM104277s2 = bgw0Var.m104277s();
                    int iM104280v5 = bgw0Var.m104280v();
                    int iM104280v6 = bgw0Var.m104280v();
                    bgw0Var.m104270l(4);
                    if (iM104280v6 == 1835360622) {
                        strM104258O2 = bgw0Var.m104258O(iM104280v5 - 12);
                    } else {
                        int i6 = iM104280v5 - 12;
                        if (iM104280v6 == 1851878757) {
                            strM104258O3 = bgw0Var.m104258O(i6);
                        } else {
                            if (iM104280v6 == 1684108385) {
                                i5 = iM104280v5;
                            }
                            if (iM104280v6 == 1684108385) {
                                i4 = iM104277s2;
                            }
                            bgw0Var.m104270l(i6);
                        }
                    }
                }
                if (strM104258O2 != null && strM104258O3 != null && i4 != -1) {
                    bgw0Var.m104269k(i4);
                    bgw0Var.m104270l(16);
                    zzbxVarM216737e = new zzagt(strM104258O2, strM104258O3, bgw0Var.m104258O(i5 - 16));
                }
            } else {
                y4w0.m214274b("MetadataUtil", "Skipped unknown metadata entry: " + zlr0.m220301b(iM104280v));
            }
            bgw0Var.m104269k(iM104277s);
            return zzbxVarM216737e;
        } catch (Throwable th) {
            bgw0Var.m104269k(iM104277s);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m216734b(bgw0 bgw0Var) {
        bgw0Var.m104270l(4);
        if (bgw0Var.m104280v() == 1684108385) {
            bgw0Var.m104270l(8);
            return bgw0Var.m104245B();
        }
        y4w0.m214278f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static zzagr m216735c(int i, String str, bgw0 bgw0Var, boolean z, boolean z2) {
        int iM216734b = m216734b(bgw0Var);
        if (z2) {
            iM216734b = Math.min(1, iM216734b);
        }
        if (iM216734b >= 0) {
            return z ? new zzagz(str, null, zzgaa.zzm(Integer.toString(iM216734b))) : new zzagk(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, str, Integer.toString(iM216734b));
        }
        y4w0.m214278f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zlr0.m220301b(i)));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static zzagz m216736d(int i, String str, bgw0 bgw0Var) {
        int iM104280v = bgw0Var.m104280v();
        if (bgw0Var.m104280v() == 1684108385 && iM104280v >= 22) {
            bgw0Var.m104270l(10);
            int iM104249F = bgw0Var.m104249F();
            if (iM104249F > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iM104249F);
                String string = sb.toString();
                int iM104249F2 = bgw0Var.m104249F();
                if (iM104249F2 > 0) {
                    string = string + "/" + iM104249F2;
                }
                return new zzagz(str, null, zzgaa.zzm(string));
            }
        }
        y4w0.m214278f("MetadataUtil", "Failed to parse index/count attribute: ".concat(zlr0.m220301b(i)));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static zzagz m216737e(int i, String str, bgw0 bgw0Var) {
        int iM104280v = bgw0Var.m104280v();
        if (bgw0Var.m104280v() == 1684108385) {
            bgw0Var.m104270l(8);
            return new zzagz(str, null, zzgaa.zzm(bgw0Var.m104258O(iM104280v - 16)));
        }
        y4w0.m214278f("MetadataUtil", "Failed to parse text attribute: ".concat(zlr0.m220301b(i)));
        return null;
    }
}
