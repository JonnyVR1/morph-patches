package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzja {

    @Nullable
    private zza[] addressComponents;

    @Nullable
    private String businessStatus;

    @Nullable
    private Boolean curbsidePickup;

    @Nullable
    private zzd currentOpeningHours;

    @Nullable
    private Boolean delivery;

    @Nullable
    private Boolean dineIn;

    @Nullable
    private zzb editorialSummary;

    @Nullable
    private String formattedAddress;

    @Nullable
    private zzc geometry;

    @Nullable
    private String icon;

    @Nullable
    private String iconBackgroundColor;

    @Nullable
    private String iconMaskBaseUri;

    @Nullable
    private String internationalPhoneNumber;

    @Nullable
    private String name;

    @Nullable
    private zzd openingHours;

    @Nullable
    private zze[] photos;

    @Nullable
    private String placeId;

    @Nullable
    private zzf plusCode;

    @Nullable
    private Integer priceLevel;

    @Nullable
    private Double rating;

    @Nullable
    private Boolean reservable;

    @Nullable
    private zzd[] secondaryOpeningHours;

    @Nullable
    private Boolean servesBeer;

    @Nullable
    private Boolean servesBreakfast;

    @Nullable
    private Boolean servesBrunch;

    @Nullable
    private Boolean servesDinner;

    @Nullable
    private Boolean servesLunch;

    @Nullable
    private Boolean servesVegetarianFood;

    @Nullable
    private Boolean servesWine;

    @Nullable
    private Boolean takeout;

    @Nullable
    private String[] types;

    @Nullable
    private Integer userRatingsTotal;

    @Nullable
    private Integer utcOffset;

    @Nullable
    private String website;

    @Nullable
    private Boolean wheelchairAccessibleEntrance;

    class zza {

        @Nullable
        private String longName;

        @Nullable
        private String shortName;

        @Nullable
        private String[] types;

        public final zznx zza() {
            String[] strArr = this.types;
            return strArr != null ? zznx.zzk(strArr) : zznx.zzl();
        }

        @Nullable
        public final String zzb() {
            return this.longName;
        }

        @Nullable
        public final String zzc() {
            return this.shortName;
        }
    }

    class zzb {

        @Nullable
        private String language;

        @Nullable
        private String overview;

        @Nullable
        public final String zza() {
            return this.language;
        }

        @Nullable
        public final String zzb() {
            return this.overview;
        }
    }

    class zzc {

        @Nullable
        private zza location;

        @Nullable
        private zzb viewport;

        class zza {

            @Nullable
            private Double lat;

            @Nullable
            private Double lng;

            @Nullable
            public final Double zza() {
                return this.lat;
            }

            @Nullable
            public final Double zzb() {
                return this.lng;
            }
        }

        class zzb {

            @Nullable
            private zza northeast;

            @Nullable
            private zza southwest;

            @Nullable
            public final zza zza() {
                return this.northeast;
            }

            @Nullable
            public final zza zzb() {
                return this.southwest;
            }
        }

        @Nullable
        public final zza zza() {
            return this.location;
        }

        @Nullable
        public final zzb zzb() {
            return this.viewport;
        }
    }

    class zzd {

        @Nullable
        private zza[] periods;

        @Nullable
        private zzb[] specialDays;

        @Nullable
        private String type;

        @Nullable
        private String[] weekdayText;

        class zza {

            @Nullable
            private zzc close;

            @Nullable
            private zzc open;

            @Nullable
            public final zzc zza() {
                return this.close;
            }

            @Nullable
            public final zzc zzb() {
                return this.open;
            }
        }

        class zzb {

            @Nullable
            private String date;

            @Nullable
            private Boolean exceptionalHours;

            @Nullable
            public final Boolean zza() {
                return this.exceptionalHours;
            }

            @Nullable
            public final String zzb() {
                return this.date;
            }
        }

        class zzc {

            @Nullable
            private String date;

            @Nullable
            private Integer day;

            @Nullable
            private String time;

            @Nullable
            private Boolean truncated;

            @Nullable
            public final Boolean zza() {
                return this.truncated;
            }

            @Nullable
            public final Integer zzb() {
                return this.day;
            }

            @Nullable
            public final String zzc() {
                return this.date;
            }

            @Nullable
            public final String zzd() {
                return this.time;
            }
        }

        public final zznx zza() {
            zza[] zzaVarArr = this.periods;
            return zzaVarArr != null ? zznx.zzk(zzaVarArr) : zznx.zzl();
        }

        public final zznx zzb() {
            zzb[] zzbVarArr = this.specialDays;
            return zzbVarArr != null ? zznx.zzk(zzbVarArr) : zznx.zzl();
        }

        public final zznx zzc() {
            String[] strArr = this.weekdayText;
            return strArr != null ? zznx.zzk(strArr) : zznx.zzl();
        }

        @Nullable
        public final String zzd() {
            return this.type;
        }
    }

    class zze {

        @Nullable
        private Integer height;

        @Nullable
        private String[] htmlAttributions;

        @Nullable
        private String photoReference;

        @Nullable
        private Integer width;

        public final zznx zza() {
            String[] strArr = this.htmlAttributions;
            return strArr != null ? zznx.zzk(strArr) : zznx.zzl();
        }

        @Nullable
        public final Integer zzb() {
            return this.height;
        }

        @Nullable
        public final Integer zzc() {
            return this.width;
        }

        @Nullable
        public final String zzd() {
            return this.photoReference;
        }
    }

    class zzf {

        @Nullable
        private String compoundCode;

        @Nullable
        private String globalCode;

        @Nullable
        public final String zza() {
            return this.compoundCode;
        }

        @Nullable
        public final String zzb() {
            return this.globalCode;
        }
    }

    @Nullable
    public final String zzA() {
        return this.formattedAddress;
    }

    @Nullable
    public final String zzB() {
        return this.iconBackgroundColor;
    }

    @Nullable
    public final String zzC() {
        return this.iconMaskBaseUri;
    }

    @Nullable
    public final String zzD() {
        return this.internationalPhoneNumber;
    }

    @Nullable
    public final String zzE() {
        return this.name;
    }

    @Nullable
    public final String zzF() {
        return this.placeId;
    }

    @Nullable
    public final String zzG() {
        return this.website;
    }

    @Nullable
    public final zzb zza() {
        return this.editorialSummary;
    }

    @Nullable
    public final zzc zzb() {
        return this.geometry;
    }

    @Nullable
    public final zzd zzc() {
        return this.currentOpeningHours;
    }

    @Nullable
    public final zzd zzd() {
        return this.openingHours;
    }

    @Nullable
    public final zzf zze() {
        return this.plusCode;
    }

    public final zznx zzf() {
        zza[] zzaVarArr = this.addressComponents;
        return zzaVarArr != null ? zznx.zzk(zzaVarArr) : zznx.zzl();
    }

    public final zznx zzg() {
        zze[] zzeVarArr = this.photos;
        return zzeVarArr != null ? zznx.zzk(zzeVarArr) : zznx.zzl();
    }

    public final zznx zzh() {
        zzd[] zzdVarArr = this.secondaryOpeningHours;
        return zzdVarArr != null ? zznx.zzk(zzdVarArr) : zznx.zzl();
    }

    public final zznx zzi() {
        String[] strArr = this.types;
        return strArr != null ? zznx.zzk(strArr) : zznx.zzl();
    }

    @Nullable
    public final Boolean zzj() {
        return this.curbsidePickup;
    }

    @Nullable
    public final Boolean zzk() {
        return this.delivery;
    }

    @Nullable
    public final Boolean zzl() {
        return this.dineIn;
    }

    @Nullable
    public final Boolean zzm() {
        return this.reservable;
    }

    @Nullable
    public final Boolean zzn() {
        return this.servesBeer;
    }

    @Nullable
    public final Boolean zzo() {
        return this.servesBreakfast;
    }

    @Nullable
    public final Boolean zzp() {
        return this.servesDinner;
    }

    @Nullable
    public final Boolean zzq() {
        return this.servesLunch;
    }

    @Nullable
    public final Boolean zzr() {
        return this.servesVegetarianFood;
    }

    @Nullable
    public final Boolean zzs() {
        return this.servesWine;
    }

    @Nullable
    public final Boolean zzt() {
        return this.takeout;
    }

    @Nullable
    public final Boolean zzu() {
        return this.wheelchairAccessibleEntrance;
    }

    @Nullable
    public final Double zzv() {
        return this.rating;
    }

    @Nullable
    public final Integer zzw() {
        return this.priceLevel;
    }

    @Nullable
    public final Integer zzx() {
        return this.userRatingsTotal;
    }

    @Nullable
    public final Integer zzy() {
        return this.utcOffset;
    }

    @Nullable
    public final String zzz() {
        return this.businessStatus;
    }
}
