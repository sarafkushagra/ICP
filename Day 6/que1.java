class Solution {
    public boolean helper(char[][]board,int cr,int cc,int er,int ec,String word,int idx){ 
        if(idx == word.length())
        return true;
        if(cr<0 || cc<0 || cr>er || cc>ec || board[cr][cc]=='*')
        return false;
        if(board[cr][cc]==word.charAt(idx)){
            board[cr][cc]='*';
            boolean up = helper(board,cr-1,cc,er,ec,word,idx+1);
            if(up==true) return true;
            boolean down = helper(board,cr+1,cc,er,ec,word,idx+1);
            if(down==true) return true;
            boolean left = helper(board,cr,cc-1,er,ec,word,idx+1);
            if(left==true) return true;
            boolean right = helper(board,cr,cc+1,er,ec,word,idx+1);
            if(right==true) return true;
            board[cr][cc]=word.charAt(idx);
            return false;
        }
        else{
            return false;
        }

    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(board,i,j,board.length-1,board[0].length-1,word,0))
                    return true;
                }
            }
        }
        return false;
    }
}