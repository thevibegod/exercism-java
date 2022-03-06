class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G' -> rnaStrand.append('C');
                case 'C' -> rnaStrand.append('G');
                case 'T' -> rnaStrand.append('A');
                case 'A' -> rnaStrand.append('U');
            }
        }
        return rnaStrand.toString();
    }

}
