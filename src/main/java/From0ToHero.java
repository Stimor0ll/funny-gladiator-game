public class From0ToHero {



        // sk [0..99]; 0 -> "nulis"
        public String convertNumberToString(int sk) {



            if(sk >= 0 && sk < 10){
                return Vienaskaita.values()[sk].toString();
            }
            if(sk >= 10 && sk < 20){
                return Nioliktiniai.values()[sk].toString();
            }
            if(sk >= 20 && sk < 100){
//            Desimtys.values()[sk/10].toString();
//            Vienaskaita.values()[sk%10].toString();

                int desimciuSk = sk / 10 - 2;
                int vienaskaituSk = sk % 10;

                if(vienaskaituSk == 0) {
                    return Desimtys.values()[desimciuSk].toString();
                }
                else {
                    return Desimtys.values()[desimciuSk].toString()+ " " + Vienaskaita.values()[vienaskaituSk].toString();

                }

            }

            return "not in 0 to 99 range";

        }


        public enum Vienaskaita {NULIS, VIENAS, DU, TRYS, KETURI, PENKI, SESI,
            SEPTYNI, ASTUONI, DEVYNI}
        public enum Nioliktiniai {DESIMT, VIENUOLIKA, DVYLIKA, TRYLIKA, KETURIOLIKA, PENKIOLIKA, SESIOLIKA,
            SEPTYNIOLIKA, ASTUONIOLIKA, DEVYNIOLIKA}
        public enum Desimtys {DVIDESIMT, TRISDESIMT, KETURIASDESIMT, PENKIASDESIMT, SESIASDESIMT, SEPTYNIASDESIMT,
            ASTUONIASDESIMT, DEVYNIASDESIMT}

    }





