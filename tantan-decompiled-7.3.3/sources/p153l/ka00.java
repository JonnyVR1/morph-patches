package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ka00 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final String[] f124607a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    /* JADX INFO: renamed from: a */
    public static CommentFrame m148906a(int i, ig60 ig60Var) {
        int iM139827q = ig60Var.m139827q();
        if (ig60Var.m139827q() == 1684108385) {
            ig60Var.m139809V(8);
            String strM139790C = ig60Var.m139790C(iM139827q - 16);
            return new CommentFrame(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, strM139790C, strM139790C);
        }
        kyv.m152151i("MetadataUtil", "Failed to parse comment attribute: " + f31.m123697a(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ApicFrame m148907b(ig60 ig60Var) {
        String str;
        int iM139827q = ig60Var.m139827q();
        if (ig60Var.m139827q() != 1684108385) {
            kyv.m152151i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM123698b = f31.m123698b(ig60Var.m139827q());
        if (iM123698b == 13) {
            str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        } else {
            str = iM123698b == 14 ? DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG : null;
        }
        if (str == null) {
            kyv.m152151i("MetadataUtil", "Unrecognized cover art flags: " + iM123698b);
            return null;
        }
        ig60Var.m139809V(4);
        int i = iM139827q - 16;
        byte[] bArr = new byte[i];
        ig60Var.m139822l(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata.Entry m148908c(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f() + ig60Var.m139827q();
        int iM139827q = ig60Var.m139827q();
        int i = (iM139827q >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM139827q;
                if (i2 == 6516084) {
                    CommentFrame commentFrameM148906a = m148906a(iM139827q, ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return commentFrameM148906a;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    TextInformationFrame textInformationFrameM148913h = m148913h(iM139827q, "TIT2", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    TextInformationFrame textInformationFrameM148913h2 = m148913h(iM139827q, "TCOM", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h2;
                }
                if (i2 == 6578553) {
                    TextInformationFrame textInformationFrameM148913h3 = m148913h(iM139827q, "TDRC", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h3;
                }
                if (i2 == 4280916) {
                    TextInformationFrame textInformationFrameM148913h4 = m148913h(iM139827q, "TPE1", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h4;
                }
                if (i2 == 7630703) {
                    TextInformationFrame textInformationFrameM148913h5 = m148913h(iM139827q, "TSSE", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h5;
                }
                if (i2 == 6384738) {
                    TextInformationFrame textInformationFrameM148913h6 = m148913h(iM139827q, "TALB", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h6;
                }
                if (i2 == 7108978) {
                    TextInformationFrame textInformationFrameM148913h7 = m148913h(iM139827q, "USLT", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h7;
                }
                if (i2 == 6776174) {
                    TextInformationFrame textInformationFrameM148913h8 = m148913h(iM139827q, "TCON", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h8;
                }
                if (i2 == 6779504) {
                    TextInformationFrame textInformationFrameM148913h9 = m148913h(iM139827q, "TIT1", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h9;
                }
            } else {
                if (iM139827q == 1735291493) {
                    TextInformationFrame textInformationFrameM148912g = m148912g(ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148912g;
                }
                if (iM139827q == 1684632427) {
                    TextInformationFrame textInformationFrameM148909d = m148909d(iM139827q, "TPOS", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148909d;
                }
                if (iM139827q == 1953655662) {
                    TextInformationFrame textInformationFrameM148909d2 = m148909d(iM139827q, "TRCK", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148909d2;
                }
                if (iM139827q == 1953329263) {
                    Id3Frame id3FrameM148914i = m148914i(iM139827q, "TBPM", ig60Var, true, false);
                    ig60Var.m139808U(iM139816f);
                    return id3FrameM148914i;
                }
                if (iM139827q == 1668311404) {
                    Id3Frame id3FrameM148914i2 = m148914i(iM139827q, "TCMP", ig60Var, true, true);
                    ig60Var.m139808U(iM139816f);
                    return id3FrameM148914i2;
                }
                if (iM139827q == 1668249202) {
                    ApicFrame apicFrameM148907b = m148907b(ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return apicFrameM148907b;
                }
                if (iM139827q == 1631670868) {
                    TextInformationFrame textInformationFrameM148913h10 = m148913h(iM139827q, "TPE2", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h10;
                }
                if (iM139827q == 1936682605) {
                    TextInformationFrame textInformationFrameM148913h11 = m148913h(iM139827q, "TSOT", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h11;
                }
                if (iM139827q == 1936679276) {
                    TextInformationFrame textInformationFrameM148913h12 = m148913h(iM139827q, "TSO2", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h12;
                }
                if (iM139827q == 1936679282) {
                    TextInformationFrame textInformationFrameM148913h13 = m148913h(iM139827q, "TSOA", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h13;
                }
                if (iM139827q == 1936679265) {
                    TextInformationFrame textInformationFrameM148913h14 = m148913h(iM139827q, "TSOP", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h14;
                }
                if (iM139827q == 1936679791) {
                    TextInformationFrame textInformationFrameM148913h15 = m148913h(iM139827q, "TSOC", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h15;
                }
                if (iM139827q == 1920233063) {
                    Id3Frame id3FrameM148914i3 = m148914i(iM139827q, "ITUNESADVISORY", ig60Var, false, false);
                    ig60Var.m139808U(iM139816f);
                    return id3FrameM148914i3;
                }
                if (iM139827q == 1885823344) {
                    Id3Frame id3FrameM148914i4 = m148914i(iM139827q, "ITUNESGAPLESS", ig60Var, false, true);
                    ig60Var.m139808U(iM139816f);
                    return id3FrameM148914i4;
                }
                if (iM139827q == 1936683886) {
                    TextInformationFrame textInformationFrameM148913h16 = m148913h(iM139827q, "TVSHOWSORT", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h16;
                }
                if (iM139827q == 1953919848) {
                    TextInformationFrame textInformationFrameM148913h17 = m148913h(iM139827q, "TVSHOW", ig60Var);
                    ig60Var.m139808U(iM139816f);
                    return textInformationFrameM148913h17;
                }
                if (iM139827q == 757935405) {
                    Id3Frame id3FrameM148910e = m148910e(ig60Var, iM139816f);
                    ig60Var.m139808U(iM139816f);
                    return id3FrameM148910e;
                }
            }
            kyv.m152144b("MetadataUtil", "Skipped unknown metadata entry: " + f31.m123697a(iM139827q));
            ig60Var.m139808U(iM139816f);
            return null;
        } catch (Throwable th) {
            ig60Var.m139808U(iM139816f);
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static TextInformationFrame m148909d(int i, String str, ig60 ig60Var) {
        int iM139827q = ig60Var.m139827q();
        if (ig60Var.m139827q() == 1684108385 && iM139827q >= 22) {
            ig60Var.m139809V(10);
            int iM139801N = ig60Var.m139801N();
            if (iM139801N > 0) {
                String str2 = "" + iM139801N;
                int iM139801N2 = ig60Var.m139801N();
                if (iM139801N2 > 0) {
                    str2 = str2 + "/" + iM139801N2;
                }
                return new TextInformationFrame(str, null, ImmutableList.m15740of(str2));
            }
        }
        kyv.m152151i("MetadataUtil", "Failed to parse index/count attribute: " + f31.m123697a(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Id3Frame m148910e(ig60 ig60Var, int i) {
        String strM139790C = null;
        String strM139790C2 = null;
        int i2 = -1;
        int i3 = -1;
        while (ig60Var.m139816f() < i) {
            int iM139816f = ig60Var.m139816f();
            int iM139827q = ig60Var.m139827q();
            int iM139827q2 = ig60Var.m139827q();
            ig60Var.m139809V(4);
            if (iM139827q2 == 1835360622) {
                strM139790C = ig60Var.m139790C(iM139827q - 12);
            } else if (iM139827q2 == 1851878757) {
                strM139790C2 = ig60Var.m139790C(iM139827q - 12);
            } else {
                if (iM139827q2 == 1684108385) {
                    i2 = iM139816f;
                    i3 = iM139827q;
                }
                ig60Var.m139809V(iM139827q - 12);
            }
        }
        if (strM139790C == null || strM139790C2 == null || i2 == -1) {
            return null;
        }
        ig60Var.m139808U(i2);
        ig60Var.m139809V(16);
        return new InternalFrame(strM139790C, strM139790C2, ig60Var.m139790C(i3 - 16));
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static MdtaMetadataEntry m148911f(ig60 ig60Var, int i, String str) {
        while (true) {
            int iM139816f = ig60Var.m139816f();
            if (iM139816f >= i) {
                return null;
            }
            int iM139827q = ig60Var.m139827q();
            if (ig60Var.m139827q() == 1684108385) {
                int iM139827q2 = ig60Var.m139827q();
                int iM139827q3 = ig60Var.m139827q();
                int i2 = iM139827q - 16;
                byte[] bArr = new byte[i2];
                ig60Var.m139822l(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, iM139827q3, iM139827q2);
            }
            ig60Var.m139808U(iM139816f + iM139827q);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public static TextInformationFrame m148912g(ig60 ig60Var) {
        String str;
        int iM148915j = m148915j(ig60Var);
        if (iM148915j > 0) {
            String[] strArr = f124607a;
            if (iM148915j <= strArr.length) {
                str = strArr[iM148915j - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, ImmutableList.m15740of(str));
        }
        kyv.m152151i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static TextInformationFrame m148913h(int i, String str, ig60 ig60Var) {
        int iM139827q = ig60Var.m139827q();
        if (ig60Var.m139827q() == 1684108385) {
            ig60Var.m139809V(8);
            return new TextInformationFrame(str, null, ImmutableList.m15740of(ig60Var.m139790C(iM139827q - 16)));
        }
        kyv.m152151i("MetadataUtil", "Failed to parse text attribute: " + f31.m123697a(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Id3Frame m148914i(int i, String str, ig60 ig60Var, boolean z, boolean z2) {
        int iM148915j = m148915j(ig60Var);
        if (z2) {
            iM148915j = Math.min(1, iM148915j);
        }
        if (iM148915j >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.m15740of(Integer.toString(iM148915j))) : new CommentFrame(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, str, Integer.toString(iM148915j));
        }
        kyv.m152151i("MetadataUtil", "Failed to parse uint8 attribute: " + f31.m123697a(i));
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static int m148915j(ig60 ig60Var) {
        ig60Var.m139809V(4);
        if (ig60Var.m139827q() == 1684108385) {
            ig60Var.m139809V(8);
            return ig60Var.m139795H();
        }
        kyv.m152151i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static void m148916k(int i, ilj iljVar, C1894k.b bVar) {
        if (i == 1 && iljVar.m140628a()) {
            bVar.m10383P(iljVar.f115580a).m10384Q(iljVar.f115581b);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m148917l(int i, @Nullable Metadata metadata, @Nullable Metadata metadata2, C1894k.b bVar, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i != 1 || metadata == null) {
            metadata = metadata3;
        }
        if (metadata2 != null) {
            for (int i2 = 0; i2 < metadata2.m10587e(); i2++) {
                Metadata.Entry entryM10586d = metadata2.m10586d(i2);
                if (entryM10586d instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryM10586d;
                    if (!mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        metadata = metadata.m10583a(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata = metadata.m10583a(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.m10584b(metadata4);
        }
        if (metadata.m10587e() > 0) {
            bVar.m10393Z(metadata);
        }
    }
}
